resource "aws_vpc" "vpc" {
    cidr_block = "10.0.0.0/16" #IPv4 CIDR Block
    enable_dns_hostnames = true #DNS Hostname 사용 옵션, 기본은 false
    tags =  { Name = "vpc"} #tag 입력
}

## terraform plan 출력 확인.


# 인터넷 게이트웨이 생성
resource "aws_internet_gateway" "terra-igw" {
    vpc_id = aws_vpc.vpc.id #어느 VPC와 연결할 것인지 지정
    tags = { Name = "terra-IGW"}  #태그 설정
}

# NAT 게이트웨이가 사용할 Elastic IP생성
resource "aws_eip" "nat" {
  vpc      = true  #생성 범위 지정
}

# NAT 게이트웨이 생성
resource "aws_nat_gateway" "nat" {
  allocation_id = aws_eip.nat.id #EIP 연결
  subnet_id     = aws_subnet.terra-sub-public1.id #NAT가 사용될 서브넷 지정

  tags = {
    Name = "terra-NAT"
  }
}

# Subnet Public
resource "aws_subnet" "terra-sub-public1" {
    vpc_id = aws_vpc.vpc.id #위에서 생성한 vpc 별칭 입력
    cidr_block = "10.0.10.0/24" #IPv4 CIDER 블럭
    availability_zone = "ap-northeast-1" #가용영역 지정
    map_public_ip_on_launch = true #퍼블릭 IP 자동 부여 설정
    tags = { Name = "terra-sub-public1"} #태그 설정

}


# Subnet Private
resource "aws_subnet" "terra-sub-private1" {
    vpc_id = aws_vpc.vpc.id #위에서 생성한 vpc 별칭 입력
    cidr_block = "10.0.11.0/24" #IPv4 CIDER 블럭
    availability_zone = "ap-northeast-1" #가용영역 지정
    map_public_ip_on_launch = false #퍼블릭 IP 안씀
    tags = { Name = "terra-sub-private1"} #태그 설정
}


# public routing
resource "aws_route_table" "terra-public1" {
  vpc_id = aws_vpc.vpc.id #VPC 별칭 입력
  route {
    cidr_block = "0.0.0.0/0"
    gateway_id = "aws_internet_gateway.terra-igw.id" #Internet Gateway 별칭 입력
  }
  tags = { Name = "terra-public1" } #태그 설정
}

# resource "aws_route_table" "terra-public2" {
#   vpc_id = aws_vpc.vpc.id #VPC 별칭 입력
#   route {
#     cidr_block = "0.0.0.0/0"
#     gateway_id = "aws_internet_gateway.terra-igw.id" #Internet Gateway 별칭 입력
#   }
#   tags = { Name = "terra-public2" } #태그 설정
# }



# private routing
resource "aws_route_table" "terra-private1" {
  vpc_id = aws_vpc.vpc.id #VPC 별칭 입력
  route {
    cidr_block = "0.0.0.0/0"
    gateway_id = "aws_nat_gateway.nat.id" #NAT Gateway 별칭 입력
  }
  tags = { Name = "terra-private1" } #태그 설정
}

# resource "aws_route_table" "terra-private2" {
#   vpc_id = aws_vpc.vpc.id #VPC 별칭 입력
#   route {
#     cidr_block = "0.0.0.0/0"
#     gateway_id = "aws_nat_gateway.nat.id" #NAT Gateway 별칭 입력
#   }
#   tags = { Name = "terra-private2" } #태그 설정
# }


resource "aws_route_table_association" "terra-routing-public1" {
  subnet_id      = aws_subnet.terra-sub-public1.id
  route_table_id = aws_route_table.terra-public1.id
}

# resource "aws_route_table_association" "terra-routing-public2" {
#   subnet_id      = aws_subnet.terra-sub-public2.id
#   route_table_id = aws_route_table.terra-public2.id
# }

resource "aws_route_table_association" "terra-routing-private1" {
  subnet_id      = aws_subnet.terra-sub-private1.id
  route_table_id = aws_route_table.terra-private1.id
}

# resource "aws_route_table_association" "terra-routing-private2" {
#   subnet_id      = aws_subnet.terra-sub-private2.id
#   route_table_id = aws_route_table.terra-private2.id
# }

# resource "aws_subnet" "terra-sub-public2" {
#     vpc_id = aws_vpc.vpc.id
#     cidr_block  = "10.0.20.0/24"
#     availability_zone = "ap-northeast-2"
#     map_public_ip_on_launch = true
#     tags = { Name = "terra-sub-public2"}
# }



# resource "aws_subnet" "terra-sub-private2" {
#     vpc_id = aws_vpc.vpc.id
#     cidr_block  = "10.0.21.0/24"
#     availability_zone = "ap-northeast-2"
#     map_public_ip_on_launch = false #퍼블릭 IP X
#     tags = { Name = "terra-sub-private2"}
# }


## terraform apply 