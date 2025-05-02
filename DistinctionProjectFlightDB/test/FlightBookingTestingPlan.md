# Flight Booking System Test Plan

## 1. Introduction

This document outlines the test plan for the Flight Booking System. The system allows users to manage customers, routes, flights, and bookings through file-based persistence.

## 2. Test Scope

The following components will be tested:

- Customer data management
- Route data management
- Flight data management
- Booking data management
- Data validation
- User interface functionality

## 3. Test Strategy

### 3.1 Testing Levels

- **Unit Testing**: Testing individual classes and methods
- **Integration Testing**: Testing interaction between components
- **System Testing**: Testing the complete system functionality

### 3.2 Testing Types

- **Functional Testing**: Verify features work as expected
- **Data Validation Testing**: Ensure input validation works correctly
- **Error Handling Testing**: Verify error scenarios are handled properly
- **Usability Testing**: Evaluate user interaction with the system

## 4. Test Environment

- Java Development Kit (JDK) 22
- Windows/Linux Operating System
- File system with read/write permissions

## 5. Test Cases

### 5.1 Customer Management Tests

| Test ID | Test Description               | Test Steps                                                                              | Expected Results                             | Priority |
| ------- | ------------------------------ | --------------------------------------------------------------------------------------- | -------------------------------------------- | -------- |
| C-01    | Add new customer               | 1. Select Customer option<br>2. Select Save data<br>3. Enter valid customer information | Customer data written to file successfully   | High     |
| C-02    | Add customer with duplicate ID | 1. Select Customer option<br>2. Select Save data<br>3. Enter an existing customer ID    | System should display error message          | High     |
| C-03    | Load customer data             | 1. Select Customer option<br>2. Select Load data                                        | Customer data loaded and displayed correctly | High     |

### 5.2 Route Management Tests

| Test ID | Test Description            | Test Steps                                                                        | Expected Results                          | Priority |
| ------- | --------------------------- | --------------------------------------------------------------------------------- | ----------------------------------------- | -------- |
| R-01    | Add new route               | 1. Select Route option<br>2. Select Save data<br>3. Enter valid route information | Route data written to file successfully   | High     |
| R-02    | Add route with duplicate ID | 1. Select Route option<br>2. Select Save data<br>3. Enter an existing route ID    | System should display error message       | High     |
| R-03    | Load route data             | 1. Select Route option<br>2. Select Load data                                     | Route data loaded and displayed correctly | High     |

### 5.3 Flight Management Tests

| Test ID | Test Description             | Test Steps                                                                          | Expected Results                           | Priority |
| ------- | ---------------------------- | ----------------------------------------------------------------------------------- | ------------------------------------------ | -------- |
| F-01    | Add new flight               | 1. Select Flight option<br>2. Select Save data<br>3. Enter valid flight information | Flight data written to file successfully   | High     |
| F-02    | Add flight with duplicate ID | 1. Select Flight option<br>2. Select Save data<br>3. Enter an existing flight ID    | System should display error message        | High     |
| F-03    | Add flight with invalid date | 1. Select Flight option<br>2. Select Save data<br>3. Enter invalid date format      | System should prompt for valid date        | Medium   |
| F-04    | Add flight with invalid time | 1. Select Flight option<br>2. Select Save data<br>3. Enter invalid time format      | System should prompt for valid time        | Medium   |
| F-05    | Load flight data             | 1. Select Flight option<br>2. Select Load data                                      | Flight data loaded and displayed correctly | High     |

### 5.4 Booking Management Tests

| Test ID | Test Description                     | Test Steps                                                                            | Expected Results                            | Priority |
| ------- | ------------------------------------ | ------------------------------------------------------------------------------------- | ------------------------------------------- | -------- |
| B-01    | Add new booking                      | 1. Select Booking option<br>2. Select Save data<br>3. Enter valid booking information | Booking data written to file successfully   | High     |
| B-02    | Add booking with invalid customer ID | 1. Select Booking option<br>2. Select Save data<br>3. Enter non-existent customer ID  | System should display warning message       | Medium   |
| B-03    | Add booking with invalid flight ID   | 1. Select Booking option<br>2. Select Save data<br>3. Enter non-existent flight ID    | System should display warning message       | Medium   |
| B-04    | Load booking data                    | 1. Select Booking option<br>2. Select Load data                                       | Booking data loaded and displayed correctly | High     |

### 5.5 System Navigation Tests

| Test ID | Test Description        | Test Steps                                                          | Expected Results                 | Priority |
| ------- | ----------------------- | ------------------------------------------------------------------- | -------------------------------- | -------- |
| S-01    | Main menu navigation    | 1. Start application<br>2. Select each menu option (1-5)            | Each menu option works correctly | High     |
| S-02    | Return to previous menu | 1. Enter any submenu<br>2. Select option to return to previous menu | Returns to main menu             | Medium   |
| S-03    | Exit system             | 1. Select option 5                                                  | System shuts down gracefully     | Medium   |

## 6. Test Deliverables

- Test Plan (this document)
- Test Cases
- Test Data
- Test Results/Logs
- Defect Reports

## 7. Testing Schedule

- Test planning: [02/05/2025]
- Test execution: [02/05/2025]
- Defect fixing: [02/05/2025]
- Regression testing: [02/05/2025]
- Test completion: [02/05/2025]

## 8. Risks and Contingencies

- File system access issues
- Data corruption
- Input validation failures

## 9. Approval

- [Approval authority name and signature]
- Date: [02/05/2025]
