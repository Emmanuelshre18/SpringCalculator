SpringCalculator Documentation
________________________________________
Project Description
SpringCalculator is a simple web-based calculator application developed using Spring Boot. The project demonstrates a complete DevOps workflow involving infrastructure provisioning, containerization, CI/CD automation, cloud deployment, and monitoring.
The application was containerized using Docker, deployed automatically to an AWS EC2 instance through GitHub Actions, and monitored using AWS CloudWatch.
________________________________________
Technologies Used
Technology	Purpose
Java Spring Boot	         Backend application development
Docker	         Containerization
GitHub Actions	         CI/CD pipeline automation
Terraform	Infrastructure provisioning and management
AWS EC2	         Application hosting
AWS CloudWatch	         Monitoring and logging
GitHub	         Source code management
________________________________________
Project Architecture
Developer → GitHub Repository → GitHub Actions CI/CD Pipeline
                     ↓
              Docker Image Build
                     ↓
             AWS EC2 Deployment
                     ↓
             Spring Boot Container
                     ↓
               CloudWatch Monitoring
________________________________________
Detailed Walkthrough of the Project
1. Application Development
The first phase of the project involved developing the SpringCalculator application using Spring Boot.
Features Implemented
•	Addition 
•	Subtraction 
•	Multiplication 
•	Division 
•	Web-based user interface 
The application was designed to run on port 8080.
________________________________________
2. Version Control with GitHub
The project source code was pushed to GitHub for:
•	Source control management 
•	Collaboration 
•	Integration with CI/CD workflows 
Repository Link:
SpringCalculator Repository
________________________________________
3. Containerization with Docker
The application was containerized using Docker to ensure consistency across deployment environments.
Docker Workflow
•	A Dockerfile was created 
•	Spring Boot application was packaged into a Docker image 
•	The image was configured to expose port 8080 
Benefits of Dockerization
•	Portability 
•	Faster deployment 
•	Environment consistency 
•	Simplified scaling and management 
       Container Image Link
          Image
________________________________________
4. Infrastructure Provisioning using Terraform
Terraform was used to automate the provisioning of AWS infrastructure.
Resources Provisioned
•	AWS EC2 Instance 
•	Security Groups 
•	Networking configurations 
Terraform Benefits
•	Infrastructure as Code (IaC) 
•	Reusable infrastructure configuration 
•	Automated deployments 
•	Version-controlled infrastructure 
________________________________________
5. Deployment on AWS EC2
The Dockerized Spring Boot application was deployed on an Amazon EC2 instance.
EC2 Responsibilities
•	Hosting the Docker container 
•	Running the Spring Boot application 
•	Allowing external access through port 8080 
Application Access
SpringCalculator EC2 Deployment
________________________________________
6. CI/CD Pipeline using GitHub Actions
GitHub Actions was used to automate:
•	Application build 
•	Docker image creation 
•	Deployment to EC2 
CI/CD Workflow Steps
1.	Developer pushes code to GitHub 
2.	GitHub Actions workflow is triggered 
3.	Application is built automatically 
4.	Docker image is generated 
5.	Deployment is executed on AWS EC2 
6.	Updated application becomes available online 
Benefits Achieved
•	Faster deployments 
•	Reduced manual errors 
•	Continuous integration 
•	Continuous delivery 
________________________________________
7. Monitoring with AWS CloudWatch
AWS CloudWatch was integrated to monitor:
•	EC2 instance performance 
•	Logs 
•	Resource utilization 
•	Application health 
Monitoring Benefits
•	Real-time monitoring 
•	Performance visibility 
•	Easier troubleshooting 
•	Improved system reliability 
________________________________________
Deployment Process Summary
Stage	Tool Used
Application Development	Spring Boot
Source Control	GitHub
Containerization	Docker
Infrastructure Provisioning	Terraform
CI/CD Automation	GitHub Actions
Cloud Hosting	AWS EC2
Monitoring	AWS CloudWatch
________________________________________
Challenges Encountered
1. Docker Configuration Issues
Some initial challenges occurred while configuring the Docker container and exposing the correct application port.
Solution
•	Properly configured the Dockerfile 
•	Ensured port 8080 was exposed correctly 
________________________________________
2. EC2 Security Group Configuration
The application was initially inaccessible externally.
Solution
•	Configured inbound rules for port 8080 
•	Allowed HTTP traffic through the EC2 security group 
________________________________________
3. CI/CD Deployment Errors
Some deployment workflows initially failed due to authentication and deployment script configuration issues.
Solution
•	Updated GitHub Secrets 
•	Corrected deployment scripts and permissions 
________________________________________
Conclusion
The SpringCalculator project successfully demonstrates a complete DevOps implementation pipeline from development to deployment and monitoring.
The project showcases practical experience with:
•	Spring Boot development 
•	Docker containerization 
•	Terraform infrastructure automation 
•	GitHub Actions CI/CD pipelines 
•	AWS EC2 cloud deployment 
•	CloudWatch monitoring 
This project serves as a strong demonstration of modern DevOps practices and cloud-native application deployment workflows.
