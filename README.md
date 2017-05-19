# Refactoring Kata

This code is a simple alarm which uses a remote service to sample a value and then set the alarm on or off depending on the result.
This is existing code which is packaged into a jar and used by other applications.

This kata is to review the Alarm class and to refactor this class to make it unit testable.

As part of this, identify the issues which are causing this test to be difficult to test.
Can you name the SOLID design principle which is being violated?


1.Single Responsibility Principle Violated.

Every class should have a single responsibility. There should never be more than one reason for a class to change.

Sensor class is having the responsibility to check whether the Alarm is on/off based on the threshold  value.


2.Interface Segregation Principle Violated.

Clients should not be forced to depend on interfaces they do not use.

  Based on segregating the interface IAlarm/IAlarmThreshold different clients are not forced on interfaces they do not use


3.Open/Closed Principle

Software entitites should be open for extension, but closed for modification.

 Alarm is only for checking whether it is on/off
 
 Sensor is used only for doing calculations.
 