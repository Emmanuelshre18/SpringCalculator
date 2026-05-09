variable "instance_type" {
  default = "t3.micro"

}

variable "key_name" {}

variable "docker_image" {}

variable "instance_name" {
  default = "docker-ec2"
}