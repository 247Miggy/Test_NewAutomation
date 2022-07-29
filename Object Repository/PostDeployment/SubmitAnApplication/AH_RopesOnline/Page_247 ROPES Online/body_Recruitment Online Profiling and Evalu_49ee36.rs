<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Recruitment Online Profiling and Evalu_49ee36</name>
   <tag></tag>
   <elementGuidId>41b55234-c466-4b43-92cd-42c975f633e4</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>368bd405-aa7d-4ad2-80d2-d70b5ac75cc0</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>              pace-done</value>
      <webElementGuid>189746e9-12f4-40dd-b95c-83385259c186</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  



    

    




    





    

    
        
            
                
                    
                
                
                
                    Recruitment Online Profiling and Evaluation System
                
                
                    Sign in
                
            
        
    
    
        
                        
                            
                        
                            
                        
                            
                        
                            
                        
                        
                        
                        

            
    

    
        
        
            
                
                    



        
                
                    
                        LIFE@[24]7
                        The [24]7 LIFE is our main differentiator amongst the other centers. It is our values and culture. It is the way we do things. It is our PEOPLE. And we are proud living testaments to the [24]7 LIFE.   We have discovered it, we live by it, and now we want to share it with YOU!
                    
                

        
                
                    
                        LEARN@[24]7
                        We are fully committed to provide you with innovative, trailblazing training and development that will prepare you to outperform the competition by 10% or more. This is our passion. This is our promise.
                    
                

        
        


                
                
                    
                

                
                    
                
                

                    





                
            
        
        
        
        
            

    
        
            
                ×
                
                    
                        
                            

                                
                                    
                                        













    Sign in
    
    
        
        Show
    
    
    




    $(document).ready(function () {
        $.validator.unobtrusive.parse(&quot;#frmLogin&quot;);
    });

                                    
                                

                                Log in

                                Forgot password?
                            
                            
                        
                        
                            
                                Check your application status, practice your skills in business english, vocabulary, and many more!
                            
                        
                    
                

            
        
    


            
            

    
        Apply Now
        Fill out the fields below. 
        
        
        
            
                








    .disabledbutton {
    pointer-events: none;
    opacity: 0.4;
}





    
    
        Cyber Sigmaselect
	jQuery(function(){jQuery(&quot;#selSearchCompanySiteId&quot;).kendoDropDownList({&quot;change&quot;:SITEPOSITION.doFilterRopesPositionTitleBasedSite,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetCompanySites&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SiteName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SiteId&quot;,&quot;optionLabel&quot;:&quot;-Select Site-&quot;});});

    

    
        Customer Support Representative (Day Shift)select
	jQuery(function(){jQuery(&quot;#selSearchPositionId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetCareerOpportunities&quot;,&quot;data&quot;:SITEPOSITION.doGetPositionTitleBySiteId},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;OpportunityDisplayTitleShiftOnly&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;OpportunityId&quot;,&quot;optionLabel&quot;:&quot;-Select Position-&quot;});});

    
    
        
    
    
        
        
            
            I have no middle name
        
    
    
        
    
    
        select
	jQuery(function(){jQuery(&quot;#birthDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;MM-dd-yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

    

    
        
	jQuery(function(){jQuery(&quot;#txtShortFormMobile&quot;).kendoMaskedTextBox({&quot;mask&quot;:&quot;+63 \\9000000000&quot;,&quot;rules&quot;:{}});});

    
    
        
    
    
        -Select Educational Attainment-select
	jQuery(function(){jQuery(&quot;#selSearchEducationalAttainmentId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetEducationalAttainments&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;HighestQualificationLevel&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;HighestQualificationLevelID&quot;,&quot;optionLabel&quot;:&quot;-Select Educational Attainment-&quot;});});

    

    
        -Select Main Source-select
	jQuery(function(){jQuery(&quot;#selSearchMainSourceId&quot;).kendoDropDownList({&quot;change&quot;:MAINSPECIFICSOURCE.doFilterRopesSpecificBasedMainSource,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetMainSources&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SourceName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SourceId&quot;,&quot;optionLabel&quot;:&quot;-Select Main Source-&quot;});});

    
    
        -Select Specific Source-select
	jQuery(function(){jQuery(&quot;#selSearchSpecificSourceId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetSpecificSources&quot;,&quot;data&quot;:MAINSPECIFICSOURCE.doGetSpecificSourceByMainSourceId},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SourceName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SourceId&quot;,&quot;optionLabel&quot;:&quot;-Select Specific Source-&quot;});});

    
    
        
    

    
        
        
    

            
        
    
    Submit Application


    $(document).ready(function () {
        $.validator.unobtrusive.parse(&quot;#frmRegisterShortForm&quot;);
        $('#frmRegisterShortForm').show();
    });

            
        
        
    


    
    
    
        
            
                
                    
                        
                        
                            Registration via Activation Code
                            Please provide all the needed information below and click Submit to proceed.
                            For guidelines,  click here.
                        
                    
                
                
                
                    
                        







    Email Address
    
        
        
    



    Activation Code
    
        
            
            Show
        
        
    

                    
                    
                        
                            
                                Cancel
                                Submit
                            
                        
                    
                
            
        
    





    
        
            
                
                    Have you already spoked with [24]7 phonescreeners?
                
                Please provide all the needed information below and click Submit to proceed.
            
            
                
                    
                        
                            
                                







    Email Address
    
        
        
    



    Activation Code
    
        
            
            Show
        
        
    



                            
                        
                    
                    
                        Submit
                        I haven't spoke to phonescreener yet
                    
                               
            
            
                Close
            
        
    













    
    
    




    
        
            Password Requirements and Tips
            A few reminders for you
        
        
            
                 Password Requirements
                
                    Password must be at least 8 characters.
                    Password must have at least one number
                    Password must have at least one special character (!@#$%)
                    Password must have at least one lowercase ('a'-'z')
                    Password must have at least one uppercase ('A'-'Z')
                
                
                    example: Th3ph@tkid
                
                Password Tips
                
                    Bruce Schneier's Method — Take a sentence and turn it into a password.
                    The Passphrase Method — Choose four random words and string them together
                    For long passwords, use applications like password managers.
                    Refrain from using passwords like password123 or p@ssw0rd
                
                
                     I'm done reading
                
            
        
    


    
    

    
        
            Existing Applicant Profile
            It seems like you've been here before
        
        
            
                Some important reminders
                
                    You might have registered to ROPES before, or you may have been registered automatically if you've previously sent an application to us through other media (job search sites, referred by [24]7 employee, etc) using a different email address.
                
                
                    Try retrieving your ROPES username and password here. Be sure to check your other existing email addresses (if you have more than one).
                
                
                    If that doesn't work, try signing in to your account in Facebook, LinkedIn, or Google+.
                
                
                    If you are 100% sure that this is your first time to apply to us, kindly contact the following for tech support:
                    
                        792-2477
                        start@247-inc.com
                    
                
                
                    Close
                
            
        
    





    


    
        
            CONNECT WITH US
            
                
                    
                        
                    
                
                
                    
                        
                    
                
                
                    
                        
                    
                
                
                    
                        
                    
                
            
        
        
            
                © 2015 [24]7 Philippines, Inc.
                [24]7 Ownership &amp; Legal
                Privacy Policy
                
            
        
    



    



    

    
    
    

    

    
    
    
    
    
    
    
    

    
    
        

        
        
        


        
        
            window.OfficeIdentifier = {
                queryStringOfficeId: &quot;OfficeId&quot;,
                officeId: &quot;0&quot;
            };
        
        

                


        
            $(document).ready(function () {
                localStorage.removeItem(&quot;willShowTour&quot;);
                document.getElementById(&quot;divPageHeader&quot;).remove();
                $('.datepicker').datepicker();

            });
        

    
    
    
        function getIP(json) {
            document.cookie = &quot;ip=&quot; + json.ip;
            //alert(&quot;My public IP address is: &quot; + json.ip);
        }

        $(document).ready(function () {
            $.initializeScrollToTop();
            $('.js_sub-header').append($('.js_sub-header-action'));
        });
    

    

            
                (function (i, s, o, g, r, a, m) {
                    i['GoogleAnalyticsObject'] = r; i[r] = i[r] || function () {
                        (i[r].q = i[r].q || []).push(arguments)
                    }, i[r].l = 1 * new Date(); a = s.createElement(o),
                    m = s.getElementsByTagName(o)[0]; a.async = 1; a.src = g; m.parentNode.insertBefore(a, m)
                })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

                ga('create', 'UA-65825618-1', 'auto');
                ga('send', 'pageview');

            






-Select Site-selectCyber SigmaCybergateOrtigasPampanga-Select Position-selectCustomer Support Representative (Day Shift)Facilities SpecialistJunior Recruitment SpecialistLeadership Academy Lead (Day Shift)March 2022SuMoTuWeThFrSa272812345678910111213141516171819202122232425262728293031123456789Tuesday, July 26, 2022-Select Educational Attainment-selectHigh School DiplomaSenior High SchoolVocational Diploma / Short Course CertificateBachelor's/College DegreePost Graduate Diploma / Master's DegreeProfessional License (Passed Board/Bar/Professional License Exam)Doctorate DegreeFirst Year CollegeSecond Year CollegeThird Year CollegeFourth Year College-Select Main Source-selectAdvertisementOnlinePartner ManagementEventsOn-siteReferral-Select Specific Source-select[24]7 Website[24]7.ai Academic PartnersAmbientAmpersand Management &amp; Dev't GroupApplicant ReferralAscentProAyosdito.phBen EdictioBestjobs.phBossjobBPO Career HubBpoforum.jobstreet.comBusiness TrendsCebuChicboy Pasong TamoChowking BuendiaChowking Edsa TaftChowking GuadalupeChowking Star MallCyber SigmaE-TeamEDSA Bus ShedEdukasyon.phEmployee ReferralFacebook.comFastjobsFlyersGCG Management ConsultingGetCallCenterJobs.comGGISGigaJOBGloriettaGreatjobs.phHire FilipinoHiringVenue.comIntellibridgeInterAllianceIT PinoyiTrabaho.comJob Open PhilippinesJob PHJob SolutionsJobopenings.phJobs180.comJobs4JobsJobsbulletin.comJobsCity.netJobsdB.comJobspinoy.comJobspot.phJobstreet.comJobyodaJollibee FarmersJollibee LibisJollibee OrtigasJollibee St. FrancisLanceSoft Inc.LinkedInLookUs CareersMakatiMang Inasal - JupiterMang Inasal Jollibee PlazaMang Inasal Pasong TamoMarcheMcDo BuendiaMetacomMoon Leaf ColumnMyCareer.phMynimo.comNezdaNon Applicant ReferralNorthstarrNur&amp;AiOrtigasPeople2OutsourcePh.CareersPh.JobsIsland.comPhil-Job.netPinoy ExchangePinoyjobs.phPullersRecruitment Email (start@247-inc.com)Reyes BBQ OrtigasRobinsons GalleriaShakey's El PuebloSM MegamallSouthgateSpringboarders Inc.Start Up CareersStreet BannerTapa King Export DriveTPMSTrabaho.netTrinity Workforce Solutions Inc.Tropical Hut BuendiaTrovit.com.phTumblrTwitterVCC LinkWeSelect Inc.Word of MouthWordpress.comYoutubeid(&quot;divBirthDate&quot;)/span[@class=&quot;k-widget k-datepicker k-header form-control k-state-border-down&quot;]/span[@class=&quot;k-picker-wrap k-state-default k-state-focused k-state-active k-state-border-down k-state-hover&quot;]/span[@class=&quot;k-select&quot;]</value>
      <webElementGuid>1d74ebde-abb0-41cd-bdb7-47762ea492da</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;no-js k-webkit k-webkit103 ng-scope&quot;]/body[@class=&quot;pace-done&quot;]</value>
      <webElementGuid>f379434c-9326-4a65-9181-a1c246c29c7d</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>e4916bb3-8c52-4a57-9f44-580725045a94</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
  



    

    




    





    

    
        
            
                
                    
                
                
                
                    Recruitment Online Profiling and Evaluation System
                
                
                    Sign in
                
            
        
    
    
        
                        
                            
                        
                            
                        
                            
                        
                            
                        
                        
                        
                        

            
    

    
        
        
            
                
                    



        
                
                    
                        LIFE@[24]7
                        The [24]7 LIFE is our main differentiator amongst the other centers. It is our values and culture. It is the way we do things. It is our PEOPLE. And we are proud living testaments to the [24]7 LIFE.   We have discovered it, we live by it, and now we want to share it with YOU!
                    
                

        
                
                    
                        LEARN@[24]7
                        We are fully committed to provide you with innovative, trailblazing training and development that will prepare you to outperform the competition by 10% or more. This is our passion. This is our promise.
                    
                

        
        


                
                
                    
                

                
                    
                
                

                    





                
            
        
        
        
        
            

    
        
            
                ×
                
                    
                        
                            

                                
                                    
                                        













    Sign in
    
    
        
        Show
    
    
    




    $(document).ready(function () {
        $.validator.unobtrusive.parse(&quot;#frmLogin&quot;);
    });

                                    
                                

                                Log in

                                Forgot password?
                            
                            
                        
                        
                            
                                Check your application status, practice your skills in business english, vocabulary, and many more!
                            
                        
                    
                

            
        
    


            
            

    
        Apply Now
        Fill out the fields below. 
        
        
        
            
                








    .disabledbutton {
    pointer-events: none;
    opacity: 0.4;
}





    
    
        Cyber Sigmaselect
	jQuery(function(){jQuery(&quot;#selSearchCompanySiteId&quot;).kendoDropDownList({&quot;change&quot;:SITEPOSITION.doFilterRopesPositionTitleBasedSite,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetCompanySites&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SiteName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SiteId&quot;,&quot;optionLabel&quot;:&quot;-Select Site-&quot;});});

    

    
        Customer Support Representative (Day Shift)select
	jQuery(function(){jQuery(&quot;#selSearchPositionId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetCareerOpportunities&quot;,&quot;data&quot;:SITEPOSITION.doGetPositionTitleBySiteId},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;OpportunityDisplayTitleShiftOnly&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;OpportunityId&quot;,&quot;optionLabel&quot;:&quot;-Select Position-&quot;});});

    
    
        
    
    
        
        
            
            I have no middle name
        
    
    
        
    
    
        select
	jQuery(function(){jQuery(&quot;#birthDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;MM-dd-yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

    

    
        
	jQuery(function(){jQuery(&quot;#txtShortFormMobile&quot;).kendoMaskedTextBox({&quot;mask&quot;:&quot;+63 \\9000000000&quot;,&quot;rules&quot;:{}});});

    
    
        
    
    
        -Select Educational Attainment-select
	jQuery(function(){jQuery(&quot;#selSearchEducationalAttainmentId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetEducationalAttainments&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;HighestQualificationLevel&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;HighestQualificationLevelID&quot;,&quot;optionLabel&quot;:&quot;-Select Educational Attainment-&quot;});});

    

    
        -Select Main Source-select
	jQuery(function(){jQuery(&quot;#selSearchMainSourceId&quot;).kendoDropDownList({&quot;change&quot;:MAINSPECIFICSOURCE.doFilterRopesSpecificBasedMainSource,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetMainSources&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SourceName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SourceId&quot;,&quot;optionLabel&quot;:&quot;-Select Main Source-&quot;});});

    
    
        -Select Specific Source-select
	jQuery(function(){jQuery(&quot;#selSearchSpecificSourceId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetSpecificSources&quot;,&quot;data&quot;:MAINSPECIFICSOURCE.doGetSpecificSourceByMainSourceId},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SourceName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SourceId&quot;,&quot;optionLabel&quot;:&quot;-Select Specific Source-&quot;});});

    
    
        
    

    
        
        
    

            
        
    
    Submit Application


    $(document).ready(function () {
        $.validator.unobtrusive.parse(&quot;#frmRegisterShortForm&quot;);
        $(&quot; , &quot;'&quot; , &quot;#frmRegisterShortForm&quot; , &quot;'&quot; , &quot;).show();
    });

            
        
        
    


    
    
    
        
            
                
                    
                        
                        
                            Registration via Activation Code
                            Please provide all the needed information below and click Submit to proceed.
                            For guidelines,  click here.
                        
                    
                
                
                
                    
                        







    Email Address
    
        
        
    



    Activation Code
    
        
            
            Show
        
        
    

                    
                    
                        
                            
                                Cancel
                                Submit
                            
                        
                    
                
            
        
    





    
        
            
                
                    Have you already spoked with [24]7 phonescreeners?
                
                Please provide all the needed information below and click Submit to proceed.
            
            
                
                    
                        
                            
                                







    Email Address
    
        
        
    



    Activation Code
    
        
            
            Show
        
        
    



                            
                        
                    
                    
                        Submit
                        I haven&quot; , &quot;'&quot; , &quot;t spoke to phonescreener yet
                    
                               
            
            
                Close
            
        
    













    
    
    




    
        
            Password Requirements and Tips
            A few reminders for you
        
        
            
                 Password Requirements
                
                    Password must be at least 8 characters.
                    Password must have at least one number
                    Password must have at least one special character (!@#$%)
                    Password must have at least one lowercase (&quot; , &quot;'&quot; , &quot;a&quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot;z&quot; , &quot;'&quot; , &quot;)
                    Password must have at least one uppercase (&quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot;Z&quot; , &quot;'&quot; , &quot;)
                
                
                    example: Th3ph@tkid
                
                Password Tips
                
                    Bruce Schneier&quot; , &quot;'&quot; , &quot;s Method — Take a sentence and turn it into a password.
                    The Passphrase Method — Choose four random words and string them together
                    For long passwords, use applications like password managers.
                    Refrain from using passwords like password123 or p@ssw0rd
                
                
                     I&quot; , &quot;'&quot; , &quot;m done reading
                
            
        
    


    
    

    
        
            Existing Applicant Profile
            It seems like you&quot; , &quot;'&quot; , &quot;ve been here before
        
        
            
                Some important reminders
                
                    You might have registered to ROPES before, or you may have been registered automatically if you&quot; , &quot;'&quot; , &quot;ve previously sent an application to us through other media (job search sites, referred by [24]7 employee, etc) using a different email address.
                
                
                    Try retrieving your ROPES username and password here. Be sure to check your other existing email addresses (if you have more than one).
                
                
                    If that doesn&quot; , &quot;'&quot; , &quot;t work, try signing in to your account in Facebook, LinkedIn, or Google+.
                
                
                    If you are 100% sure that this is your first time to apply to us, kindly contact the following for tech support:
                    
                        792-2477
                        start@247-inc.com
                    
                
                
                    Close
                
            
        
    





    


    
        
            CONNECT WITH US
            
                
                    
                        
                    
                
                
                    
                        
                    
                
                
                    
                        
                    
                
                
                    
                        
                    
                
            
        
        
            
                © 2015 [24]7 Philippines, Inc.
                [24]7 Ownership &amp; Legal
                Privacy Policy
                
            
        
    



    



    

    
    
    

    

    
    
    
    
    
    
    
    

    
    
        

        
        
        


        
        
            window.OfficeIdentifier = {
                queryStringOfficeId: &quot;OfficeId&quot;,
                officeId: &quot;0&quot;
            };
        
        

                


        
            $(document).ready(function () {
                localStorage.removeItem(&quot;willShowTour&quot;);
                document.getElementById(&quot;divPageHeader&quot;).remove();
                $(&quot; , &quot;'&quot; , &quot;.datepicker&quot; , &quot;'&quot; , &quot;).datepicker();

            });
        

    
    
    
        function getIP(json) {
            document.cookie = &quot;ip=&quot; + json.ip;
            //alert(&quot;My public IP address is: &quot; + json.ip);
        }

        $(document).ready(function () {
            $.initializeScrollToTop();
            $(&quot; , &quot;'&quot; , &quot;.js_sub-header&quot; , &quot;'&quot; , &quot;).append($(&quot; , &quot;'&quot; , &quot;.js_sub-header-action&quot; , &quot;'&quot; , &quot;));
        });
    

    

            
                (function (i, s, o, g, r, a, m) {
                    i[&quot; , &quot;'&quot; , &quot;GoogleAnalyticsObject&quot; , &quot;'&quot; , &quot;] = r; i[r] = i[r] || function () {
                        (i[r].q = i[r].q || []).push(arguments)
                    }, i[r].l = 1 * new Date(); a = s.createElement(o),
                    m = s.getElementsByTagName(o)[0]; a.async = 1; a.src = g; m.parentNode.insertBefore(a, m)
                })(window, document, &quot; , &quot;'&quot; , &quot;script&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;//www.google-analytics.com/analytics.js&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;ga&quot; , &quot;'&quot; , &quot;);

                ga(&quot; , &quot;'&quot; , &quot;create&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;UA-65825618-1&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;auto&quot; , &quot;'&quot; , &quot;);
                ga(&quot; , &quot;'&quot; , &quot;send&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;pageview&quot; , &quot;'&quot; , &quot;);

            






-Select Site-selectCyber SigmaCybergateOrtigasPampanga-Select Position-selectCustomer Support Representative (Day Shift)Facilities SpecialistJunior Recruitment SpecialistLeadership Academy Lead (Day Shift)March 2022SuMoTuWeThFrSa272812345678910111213141516171819202122232425262728293031123456789Tuesday, July 26, 2022-Select Educational Attainment-selectHigh School DiplomaSenior High SchoolVocational Diploma / Short Course CertificateBachelor&quot; , &quot;'&quot; , &quot;s/College DegreePost Graduate Diploma / Master&quot; , &quot;'&quot; , &quot;s DegreeProfessional License (Passed Board/Bar/Professional License Exam)Doctorate DegreeFirst Year CollegeSecond Year CollegeThird Year CollegeFourth Year College-Select Main Source-selectAdvertisementOnlinePartner ManagementEventsOn-siteReferral-Select Specific Source-select[24]7 Website[24]7.ai Academic PartnersAmbientAmpersand Management &amp; Dev&quot; , &quot;'&quot; , &quot;t GroupApplicant ReferralAscentProAyosdito.phBen EdictioBestjobs.phBossjobBPO Career HubBpoforum.jobstreet.comBusiness TrendsCebuChicboy Pasong TamoChowking BuendiaChowking Edsa TaftChowking GuadalupeChowking Star MallCyber SigmaE-TeamEDSA Bus ShedEdukasyon.phEmployee ReferralFacebook.comFastjobsFlyersGCG Management ConsultingGetCallCenterJobs.comGGISGigaJOBGloriettaGreatjobs.phHire FilipinoHiringVenue.comIntellibridgeInterAllianceIT PinoyiTrabaho.comJob Open PhilippinesJob PHJob SolutionsJobopenings.phJobs180.comJobs4JobsJobsbulletin.comJobsCity.netJobsdB.comJobspinoy.comJobspot.phJobstreet.comJobyodaJollibee FarmersJollibee LibisJollibee OrtigasJollibee St. FrancisLanceSoft Inc.LinkedInLookUs CareersMakatiMang Inasal - JupiterMang Inasal Jollibee PlazaMang Inasal Pasong TamoMarcheMcDo BuendiaMetacomMoon Leaf ColumnMyCareer.phMynimo.comNezdaNon Applicant ReferralNorthstarrNur&amp;AiOrtigasPeople2OutsourcePh.CareersPh.JobsIsland.comPhil-Job.netPinoy ExchangePinoyjobs.phPullersRecruitment Email (start@247-inc.com)Reyes BBQ OrtigasRobinsons GalleriaShakey&quot; , &quot;'&quot; , &quot;s El PuebloSM MegamallSouthgateSpringboarders Inc.Start Up CareersStreet BannerTapa King Export DriveTPMSTrabaho.netTrinity Workforce Solutions Inc.Tropical Hut BuendiaTrovit.com.phTumblrTwitterVCC LinkWeSelect Inc.Word of MouthWordpress.comYoutubeid(&quot;divBirthDate&quot;)/span[@class=&quot;k-widget k-datepicker k-header form-control k-state-border-down&quot;]/span[@class=&quot;k-picker-wrap k-state-default k-state-focused k-state-active k-state-border-down k-state-hover&quot;]/span[@class=&quot;k-select&quot;]&quot;) or . = concat(&quot;
  



    

    




    





    

    
        
            
                
                    
                
                
                
                    Recruitment Online Profiling and Evaluation System
                
                
                    Sign in
                
            
        
    
    
        
                        
                            
                        
                            
                        
                            
                        
                            
                        
                        
                        
                        

            
    

    
        
        
            
                
                    



        
                
                    
                        LIFE@[24]7
                        The [24]7 LIFE is our main differentiator amongst the other centers. It is our values and culture. It is the way we do things. It is our PEOPLE. And we are proud living testaments to the [24]7 LIFE.   We have discovered it, we live by it, and now we want to share it with YOU!
                    
                

        
                
                    
                        LEARN@[24]7
                        We are fully committed to provide you with innovative, trailblazing training and development that will prepare you to outperform the competition by 10% or more. This is our passion. This is our promise.
                    
                

        
        


                
                
                    
                

                
                    
                
                

                    





                
            
        
        
        
        
            

    
        
            
                ×
                
                    
                        
                            

                                
                                    
                                        













    Sign in
    
    
        
        Show
    
    
    




    $(document).ready(function () {
        $.validator.unobtrusive.parse(&quot;#frmLogin&quot;);
    });

                                    
                                

                                Log in

                                Forgot password?
                            
                            
                        
                        
                            
                                Check your application status, practice your skills in business english, vocabulary, and many more!
                            
                        
                    
                

            
        
    


            
            

    
        Apply Now
        Fill out the fields below. 
        
        
        
            
                








    .disabledbutton {
    pointer-events: none;
    opacity: 0.4;
}





    
    
        Cyber Sigmaselect
	jQuery(function(){jQuery(&quot;#selSearchCompanySiteId&quot;).kendoDropDownList({&quot;change&quot;:SITEPOSITION.doFilterRopesPositionTitleBasedSite,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetCompanySites&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SiteName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SiteId&quot;,&quot;optionLabel&quot;:&quot;-Select Site-&quot;});});

    

    
        Customer Support Representative (Day Shift)select
	jQuery(function(){jQuery(&quot;#selSearchPositionId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetCareerOpportunities&quot;,&quot;data&quot;:SITEPOSITION.doGetPositionTitleBySiteId},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;OpportunityDisplayTitleShiftOnly&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;OpportunityId&quot;,&quot;optionLabel&quot;:&quot;-Select Position-&quot;});});

    
    
        
    
    
        
        
            
            I have no middle name
        
    
    
        
    
    
        select
	jQuery(function(){jQuery(&quot;#birthDate&quot;).kendoDatePicker({&quot;format&quot;:&quot;MM-dd-yyyy&quot;,&quot;min&quot;:new Date(1900,0,1,0,0,0,0),&quot;max&quot;:new Date(2099,11,31,0,0,0,0)});});

    

    
        
	jQuery(function(){jQuery(&quot;#txtShortFormMobile&quot;).kendoMaskedTextBox({&quot;mask&quot;:&quot;+63 \\9000000000&quot;,&quot;rules&quot;:{}});});

    
    
        
    
    
        -Select Educational Attainment-select
	jQuery(function(){jQuery(&quot;#selSearchEducationalAttainmentId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetEducationalAttainments&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;HighestQualificationLevel&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;HighestQualificationLevelID&quot;,&quot;optionLabel&quot;:&quot;-Select Educational Attainment-&quot;});});

    

    
        -Select Main Source-select
	jQuery(function(){jQuery(&quot;#selSearchMainSourceId&quot;).kendoDropDownList({&quot;change&quot;:MAINSPECIFICSOURCE.doFilterRopesSpecificBasedMainSource,&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetMainSources&quot;},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SourceName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SourceId&quot;,&quot;optionLabel&quot;:&quot;-Select Main Source-&quot;});});

    
    
        -Select Specific Source-select
	jQuery(function(){jQuery(&quot;#selSearchSpecificSourceId&quot;).kendoDropDownList({&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/qa-ropes-online/Applicants/Account/GetSpecificSources&quot;,&quot;data&quot;:MAINSPECIFICSOURCE.doGetSpecificSourceByMainSourceId},&quot;prefix&quot;:&quot;&quot;},&quot;schema&quot;:{&quot;errors&quot;:&quot;Errors&quot;}},&quot;dataTextField&quot;:&quot;SourceName&quot;,&quot;filter&quot;:&quot;contains&quot;,&quot;dataValueField&quot;:&quot;SourceId&quot;,&quot;optionLabel&quot;:&quot;-Select Specific Source-&quot;});});

    
    
        
    

    
        
        
    

            
        
    
    Submit Application


    $(document).ready(function () {
        $.validator.unobtrusive.parse(&quot;#frmRegisterShortForm&quot;);
        $(&quot; , &quot;'&quot; , &quot;#frmRegisterShortForm&quot; , &quot;'&quot; , &quot;).show();
    });

            
        
        
    


    
    
    
        
            
                
                    
                        
                        
                            Registration via Activation Code
                            Please provide all the needed information below and click Submit to proceed.
                            For guidelines,  click here.
                        
                    
                
                
                
                    
                        







    Email Address
    
        
        
    



    Activation Code
    
        
            
            Show
        
        
    

                    
                    
                        
                            
                                Cancel
                                Submit
                            
                        
                    
                
            
        
    





    
        
            
                
                    Have you already spoked with [24]7 phonescreeners?
                
                Please provide all the needed information below and click Submit to proceed.
            
            
                
                    
                        
                            
                                







    Email Address
    
        
        
    



    Activation Code
    
        
            
            Show
        
        
    



                            
                        
                    
                    
                        Submit
                        I haven&quot; , &quot;'&quot; , &quot;t spoke to phonescreener yet
                    
                               
            
            
                Close
            
        
    













    
    
    




    
        
            Password Requirements and Tips
            A few reminders for you
        
        
            
                 Password Requirements
                
                    Password must be at least 8 characters.
                    Password must have at least one number
                    Password must have at least one special character (!@#$%)
                    Password must have at least one lowercase (&quot; , &quot;'&quot; , &quot;a&quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot;z&quot; , &quot;'&quot; , &quot;)
                    Password must have at least one uppercase (&quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot;Z&quot; , &quot;'&quot; , &quot;)
                
                
                    example: Th3ph@tkid
                
                Password Tips
                
                    Bruce Schneier&quot; , &quot;'&quot; , &quot;s Method — Take a sentence and turn it into a password.
                    The Passphrase Method — Choose four random words and string them together
                    For long passwords, use applications like password managers.
                    Refrain from using passwords like password123 or p@ssw0rd
                
                
                     I&quot; , &quot;'&quot; , &quot;m done reading
                
            
        
    


    
    

    
        
            Existing Applicant Profile
            It seems like you&quot; , &quot;'&quot; , &quot;ve been here before
        
        
            
                Some important reminders
                
                    You might have registered to ROPES before, or you may have been registered automatically if you&quot; , &quot;'&quot; , &quot;ve previously sent an application to us through other media (job search sites, referred by [24]7 employee, etc) using a different email address.
                
                
                    Try retrieving your ROPES username and password here. Be sure to check your other existing email addresses (if you have more than one).
                
                
                    If that doesn&quot; , &quot;'&quot; , &quot;t work, try signing in to your account in Facebook, LinkedIn, or Google+.
                
                
                    If you are 100% sure that this is your first time to apply to us, kindly contact the following for tech support:
                    
                        792-2477
                        start@247-inc.com
                    
                
                
                    Close
                
            
        
    





    


    
        
            CONNECT WITH US
            
                
                    
                        
                    
                
                
                    
                        
                    
                
                
                    
                        
                    
                
                
                    
                        
                    
                
            
        
        
            
                © 2015 [24]7 Philippines, Inc.
                [24]7 Ownership &amp; Legal
                Privacy Policy
                
            
        
    



    



    

    
    
    

    

    
    
    
    
    
    
    
    

    
    
        

        
        
        


        
        
            window.OfficeIdentifier = {
                queryStringOfficeId: &quot;OfficeId&quot;,
                officeId: &quot;0&quot;
            };
        
        

                


        
            $(document).ready(function () {
                localStorage.removeItem(&quot;willShowTour&quot;);
                document.getElementById(&quot;divPageHeader&quot;).remove();
                $(&quot; , &quot;'&quot; , &quot;.datepicker&quot; , &quot;'&quot; , &quot;).datepicker();

            });
        

    
    
    
        function getIP(json) {
            document.cookie = &quot;ip=&quot; + json.ip;
            //alert(&quot;My public IP address is: &quot; + json.ip);
        }

        $(document).ready(function () {
            $.initializeScrollToTop();
            $(&quot; , &quot;'&quot; , &quot;.js_sub-header&quot; , &quot;'&quot; , &quot;).append($(&quot; , &quot;'&quot; , &quot;.js_sub-header-action&quot; , &quot;'&quot; , &quot;));
        });
    

    

            
                (function (i, s, o, g, r, a, m) {
                    i[&quot; , &quot;'&quot; , &quot;GoogleAnalyticsObject&quot; , &quot;'&quot; , &quot;] = r; i[r] = i[r] || function () {
                        (i[r].q = i[r].q || []).push(arguments)
                    }, i[r].l = 1 * new Date(); a = s.createElement(o),
                    m = s.getElementsByTagName(o)[0]; a.async = 1; a.src = g; m.parentNode.insertBefore(a, m)
                })(window, document, &quot; , &quot;'&quot; , &quot;script&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;//www.google-analytics.com/analytics.js&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;ga&quot; , &quot;'&quot; , &quot;);

                ga(&quot; , &quot;'&quot; , &quot;create&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;UA-65825618-1&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;auto&quot; , &quot;'&quot; , &quot;);
                ga(&quot; , &quot;'&quot; , &quot;send&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;pageview&quot; , &quot;'&quot; , &quot;);

            






-Select Site-selectCyber SigmaCybergateOrtigasPampanga-Select Position-selectCustomer Support Representative (Day Shift)Facilities SpecialistJunior Recruitment SpecialistLeadership Academy Lead (Day Shift)March 2022SuMoTuWeThFrSa272812345678910111213141516171819202122232425262728293031123456789Tuesday, July 26, 2022-Select Educational Attainment-selectHigh School DiplomaSenior High SchoolVocational Diploma / Short Course CertificateBachelor&quot; , &quot;'&quot; , &quot;s/College DegreePost Graduate Diploma / Master&quot; , &quot;'&quot; , &quot;s DegreeProfessional License (Passed Board/Bar/Professional License Exam)Doctorate DegreeFirst Year CollegeSecond Year CollegeThird Year CollegeFourth Year College-Select Main Source-selectAdvertisementOnlinePartner ManagementEventsOn-siteReferral-Select Specific Source-select[24]7 Website[24]7.ai Academic PartnersAmbientAmpersand Management &amp; Dev&quot; , &quot;'&quot; , &quot;t GroupApplicant ReferralAscentProAyosdito.phBen EdictioBestjobs.phBossjobBPO Career HubBpoforum.jobstreet.comBusiness TrendsCebuChicboy Pasong TamoChowking BuendiaChowking Edsa TaftChowking GuadalupeChowking Star MallCyber SigmaE-TeamEDSA Bus ShedEdukasyon.phEmployee ReferralFacebook.comFastjobsFlyersGCG Management ConsultingGetCallCenterJobs.comGGISGigaJOBGloriettaGreatjobs.phHire FilipinoHiringVenue.comIntellibridgeInterAllianceIT PinoyiTrabaho.comJob Open PhilippinesJob PHJob SolutionsJobopenings.phJobs180.comJobs4JobsJobsbulletin.comJobsCity.netJobsdB.comJobspinoy.comJobspot.phJobstreet.comJobyodaJollibee FarmersJollibee LibisJollibee OrtigasJollibee St. FrancisLanceSoft Inc.LinkedInLookUs CareersMakatiMang Inasal - JupiterMang Inasal Jollibee PlazaMang Inasal Pasong TamoMarcheMcDo BuendiaMetacomMoon Leaf ColumnMyCareer.phMynimo.comNezdaNon Applicant ReferralNorthstarrNur&amp;AiOrtigasPeople2OutsourcePh.CareersPh.JobsIsland.comPhil-Job.netPinoy ExchangePinoyjobs.phPullersRecruitment Email (start@247-inc.com)Reyes BBQ OrtigasRobinsons GalleriaShakey&quot; , &quot;'&quot; , &quot;s El PuebloSM MegamallSouthgateSpringboarders Inc.Start Up CareersStreet BannerTapa King Export DriveTPMSTrabaho.netTrinity Workforce Solutions Inc.Tropical Hut BuendiaTrovit.com.phTumblrTwitterVCC LinkWeSelect Inc.Word of MouthWordpress.comYoutubeid(&quot;divBirthDate&quot;)/span[@class=&quot;k-widget k-datepicker k-header form-control k-state-border-down&quot;]/span[@class=&quot;k-picker-wrap k-state-default k-state-focused k-state-active k-state-border-down k-state-hover&quot;]/span[@class=&quot;k-select&quot;]&quot;))]</value>
      <webElementGuid>c467b551-0955-49b3-a92c-41ff97c5370d</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
