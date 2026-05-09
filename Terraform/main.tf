provider "aws" {
  region = "us-east-1"
}

module "ec2" {
  source = "./modules/ec2"

  key_name     = var.key_name
  docker_image = var.docker_image
}

module "monitoring" {
  source = "./modules/monitoring"

  instance_id   = module.ec2.instance_id
  instance_name = var.instance_name
  alarm_email   = var.alarm_email
}