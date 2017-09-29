# TestNGListeners
For understand TestNG Listeners

<p><strong>TestNG</strong>&nbsp;listener extends the marker interface&nbsp;<strong>org.testng.ITestNGListener</strong>.</p>
<p>TestNG Listeners help to generate reports and provide test informations</p>
<p>There are 9 listeners that TestNG provides:</p>
<ul>
    <li>IExecutionListener</li>
    <li>IAnnotationTransformer</li>
    <li>IReporter</li>
    <li>IMethodInterceptor</li>
    <li>ISuiteListener</li>
    <li>ITestListener</li>
    <li>IConfigurationListener</li>
    <li>IInvokedMethodListener</li>
    <li>IHookable</li>    
</ul>

<p><strong>There is no way to define run order of listners.</strong></p>
<p>&nbsp;</p>
<p>In this repo, I have demonstrated examples of below listed listeners.</p>
<p>&nbsp;</p>

<p><em><strong>IExecutionListener</strong> </em>is a listener that trigger start and end of TestNG run. Two method:</p>
<p>a) onExecutionStart() : It called before the TestNG starts running.<br />b) onExecutionFinish(): It called after TestNG is done running all the test suites.</p>

<p><em><strong>IAnnotationTransformer</strong> </em>is a TestNG listener which allows you to modify TestNG annotation and configure it further.</p>


