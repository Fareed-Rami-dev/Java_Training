package com.jbs.service;

public class Doctor extends Employee {
	private String _spec;
	private String _uniName;
	private String _dateOfGrad;
	
   Doctor(String name,int age,String DOB, boolean married, String spec,String Uni,String DateGrad)
 
   {
	   super(name,age,DOB,married);
	   this._spec=spec;
	   this._uniName=Uni;
	   this._dateOfGrad=DateGrad;
   }
   Doctor()
   {
	   
   }
   void setSpec(String sp)
   {
	   this._spec=sp;
   }
   String getSpec()
   {
	   return this._spec;
   }
   void setUniName(String uni)
   {
	   this._uniName=uni;
   }
   String getUniName()
   {
	   return this._uniName;
   }
   void setDateOfGraduation(String d)
   {
	   if (d==" " || d.isEmpty())
	   {
		   d="N/A";
	   }
	   else 
	   {
		   this._dateOfGrad=d;
	   }
   }
   String getDateOfGraduation()
   {
	   return this._dateOfGrad; 
   }     
   
}
