provider "aws" {
  region = "ap-northeast-2"
  default_tags { tags = { Terraform = "true" } }
}

terraform {
  backend "s3" {
    dynamodb_table = "terraform-lock"
    encrypt        = true
    key            = "terraform/terraform.tfstate"
    region         = "ap-northeast-2"
    bucket         = "opgg-mirror"
  }
}

module "vpc" {
  source = "./modules/vpc"
}
