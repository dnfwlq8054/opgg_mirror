#!/bin/sh

terraform_init() {
  terraform init
}

terraform_apply() {
  terraform show tfplan
  terraform apply tfplan
}

terraform_init
terraform_apply
