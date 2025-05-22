<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Super Admin</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>2640e13c-2a4d-4750-a7d0-d16158c0241f</testSuiteGuid>
   <testCaseLink>
      <guid>c3de4247-8293-4124-97a7-6d4b35c0c58e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Super Admin/Password Administrator</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>399fa92a-fbc9-4caf-815e-2491fdaf6801</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Super Admin/User Access</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>54acef38-2786-42af-a42b-38dd930c0a19</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login/Login Super Admin</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>54acef38-2786-42af-a42b-38dd930c0a19</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Email</value>
         <variableId>86b770e7-3164-466e-acf4-8b30aded413f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>54acef38-2786-42af-a42b-38dd930c0a19</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>9dfa76b3-ddbc-4ac1-9300-65d55ecd4618</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
