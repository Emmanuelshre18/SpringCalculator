output "sns_topic_arn" {
  value = aws_sns_topic.alerts.arn
}

output "cpu_alarm_name" {
  value = aws_cloudwatch_metric_alarm.high_cpu.alarm_name
}

output "status_check_alarm_name" {
  value = aws_cloudwatch_metric_alarm.status_check.alarm_name
}

output "network_alarm_name" {
  value = aws_cloudwatch_metric_alarm.network_in.alarm_name
}