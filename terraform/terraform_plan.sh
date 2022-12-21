#!/bin/sh

terraform_init() {
  terraform init
}

select_workspace() {
  terraform workspace new "prod" 2> /dev/null
  terraform workspace select prod
}

terraform_plan() {
  terraform plan -out=tfplan
  terraform fmt -check
}

terraform_init
select_workspace
terraform_plan
