package com.swagata.model;

public  class AdminDepartment  extends SuperDepartment {
		public String departmentName()
		{
			return "Admin Department";
		}
		public String getTodaysWork()
		{
			return "Complete your document saubmission";
		}
		public String getWorkDeadline()
		{
			return "Complete by EOD";
		}
	}
