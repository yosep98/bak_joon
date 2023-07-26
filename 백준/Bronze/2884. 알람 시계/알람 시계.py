import datetime

now = datetime.datetime.now()

H, M = map(int, input().split())

desired_time = now.replace(hour=H, minute=M)
arm_time = desired_time - datetime.timedelta(minutes=45)

print(str(arm_time.hour) +" "+ str(arm_time.minute))
