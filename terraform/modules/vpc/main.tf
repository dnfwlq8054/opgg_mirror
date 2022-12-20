resource "aws_vpc" "opgg_mirror" {
  cidr_block           = var.opgg_mirror_vpc_cidr
  enable_dns_hostnames = true
  tags                 = { Name = "OPGG Mirror VPC" }
}
