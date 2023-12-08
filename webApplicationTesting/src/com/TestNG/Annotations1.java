package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {

	// @Test - represents to a Test Case

	  // the @Test Annotations is implemented with the Method - when we test a functionality
	     //     of an application

	// The names of the User-Defined methods are called as Test Case Names

	// Whenever a Class contains multiple Test Cases - then the Test Cases are executed by
	//   the TestNG based on the Alphabetical Order of the Given Test Case Name


	// if the Test case name is starting with an Upper Case letter then - the fist Method
	//  which will be executed By the TestNG is starting with Upper Case again following the
	//   alphabetical order of the given Test Case Name

	//  if the Test Case need to be executed in a proper order then the Test cases should be
//	    set with Priority

	@Test(priority=1,description=" Launching Gmail Application ")
	public void gmailApplicationLaunch()
	{
	System.out.println(" ***** Gmail Application Launched Successfully ****** ");
	}

	@Test(priority=2,description=" Gmail Application  LogIn Test")
	public void gmailApplicationLogInTest()
	{
	System.out.println(" Gmail Application LogIn Functionality Test Successfull ");
	}

	@Test(priority=3,description=" Gmail Application  InBOX Test")
	public void gmailApplicationInBoxTest()
	{
	System.out.println(" Gmail Application InBox Functionality Test Successfull ");
	}

	@Test(priority=4,description=" Gmail Application  ComposeMail Test")
	public void GmailApplicationComposeMailTest()
	{
	System.out.println(" Gmail Application ComposeMail Functionality Test Successfull ");
	}

	@Test(enabled=false,description=" Gmail Application Drafts Test") // this represents to a false Test Case - the TestNG during the
	                    //    Test Run Ignores the current Test case and will proceed to
	                    //    execute the remaining Test Cases

	                    // the default status of the Test case is - enabled=true

	public void GmailApplicationDraftsMailTest()
	{
	System.out.println(" Gmail Application DraftsMail Functionality Test Successfull ");
	}

	@Test(priority=6,description=" Gmail Application SentMail Test")
	public void GmailApplicationSentMailTest()
	{
	System.out.println(" Gmail Application SentMail Functionality Test Successfull ");
	}

	@Test(priority=7,description=" Gmail Application  Close")
	public void GmailApplicationClose()
	{
	System.out.println(" ********** Gmail Application Closed Successfully  ******** ");
	}

	}

	



