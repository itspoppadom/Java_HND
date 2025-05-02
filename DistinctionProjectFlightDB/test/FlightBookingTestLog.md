# Flight Booking System Test Log

## Test Summary

- **Date of Testing**: 02/05/2025
- **Tester**: Dominic Cameron
- **System Version**: 1.0
- **Test Environment**: Windows 11, JDK 22

## Customer Management Tests

### Test C-01: Add new customer

- **Date**: [02/05/2025]
- **Input Data**:
  - Customer ID: "C10001"
  - First Name: "John"
  - Last Name: "Smith"
  - Street: "123 Java Street"
  - Town: "Codeville"
  - Postcode: "CD12 3JV"
- **Expected Result**: Customer data written to file successfully
- **Actual Result**: Customer data written to file successfully
- **Status**: PASS
- **Comments**: The system correctly saved the new customer to Customer.csv

### Test C-02: Add customer with duplicate ID

- **Date**: [02/05/2025]
- **Input Data**:
  - Customer ID: "1" (existing ID from Customer.csv)
  - First Name: "Test"
  - Last Name: "User"
  - Street: "456 Test Lane"
  - Town: "Testville"
  - Postcode: "TS2 8TS"
- **Expected Result**: System should display error message
- **Actual Result**: System displayed message "Sorry but a record with that Customer ID already exists."
- **Status**: PASS
- **Comments**: Duplicate ID validation working as expected

### Test C-03: Load customer data

- **Date**: [02/05/2025]
- **Input Data**: N/A
- **Expected Result**: Customer data loaded and displayed correctly
- **Actual Result**: All customers from Customer.csv displayed correctly
- **Status**: PASS
- **Comments**: Data loading functionality works correctly

## Route Management Tests

### Test R-01: Add new route

- **Date**: [02/05/2025]
- **Input Data**:
  - Route ID: "R500"
  - Depart From: "London"
  - Arrive At: "Paris"
  - Mid Stop One: "None"
  - Mid Stop Two: ""
- **Expected Result**: Route data written to file successfully
- **Actual Result**: Route data written to file successfully
- **Status**: PASS
- **Comments**: New route added to Route.csv correctly

### Test R-02: Add route with duplicate ID

- **Date**: [02/05/2025]
- **Input Data**:
  - Route ID: "133" (existing ID from Route.csv)
  - Depart From: "Test"
  - Arrive At: "Test"
  - Mid Stop One: "Test"
  - Mid Stop Two: "Test"
- **Expected Result**: System should display error message
- **Actual Result**: System displayed message "Sorry but a record with that Route ID already exists."
- **Status**: PASS
- **Comments**: Duplicate route ID validation working as expected

## Flight Management Tests

### Test F-01: Add new flight

- **Date**: [02/05/2025]
- **Input Data**:
  - Flight ID: "F200"
  - Departure Date: "2024-12-25"
  - Departure Time: "09:30:00"
  - Route ID: "R500"
  - Arrival Date: "2024-12-25"
  - Arrival Time: "12:30:00"
  - Capacity: "250"
- **Expected Result**: Flight data written to file successfully
- **Actual Result**: Flight data written to file successfully
- **Status**: PASS
- **Comments**: Flight added to Flight.csv correctly

### Test F-03: Add flight with invalid date

- **Date**: [02/05/2025]
- **Input Data**:
  - Flight ID: "F201"
  - Departure Date: "25/12/2024" (invalid format)
- **Expected Result**: System should prompt for valid date
- **Actual Result**: System prompted for date in correct format (YYYY-MM-DD)
- **Status**: PASS
- **Comments**: Date validation is working as expected

### Test F-04: Add flight with invalid time

- **Date**: [02/05/2025]
- **Input Data**:
  - Flight ID: "F201"
  - Departure Date: "2024-12-25"
  - Departure Time: "25:30:00" (invalid hours)
- **Expected Result**: System should prompt for valid time
- **Actual Result**: System prompted for time in correct format (HH:MM:SS)
- **Status**: PASS
- **Comments**: Time validation is working as expected

## Booking Management Tests

### Test B-01: Add new booking

- **Date**: [02/05/2025]
- **Input Data**:
  - Booking No: "B1001"
  - Adult Tickets: 2
  - Child Tickets: 1
  - Concession Tickets: 0
  - Customer ID: "1"
  - Flight ID: "F124"
- **Expected Result**: Booking data written to file successfully
- **Actual Result**: Booking data written to file successfully
- **Status**: PASS
- **Comments**: Booking added to Booking.csv correctly

### Test B-04: Load booking data

- **Date**: [02/05/2025]
- **Input Data**: N/A
- **Expected Result**: Booking data loaded and displayed correctly
- **Actual Result**: All bookings from Booking.csv displayed correctly
- **Status**: PASS
- **Comments**: Booking data loaded and displayed correctly

## System Navigation Tests

### Test S-01: Main menu navigation

- **Date**: [02/05/2025]
- **Input Data**: Select options 1-5 sequentially
- **Expected Result**: Each menu option works correctly
- **Actual Result**: All menu options functioned as expected
- **Status**: PASS
- **Comments**: Menu navigation is working correctly

### Test S-03: Exit system

- **Date**: [02/05/2025]
- **Input Data**: Select option 5 from main menu
- **Expected Result**: System shuts down gracefully
- **Actual Result**: System displayed "Shutting Down" and exited
- **Status**: PASS
- **Comments**: Exit functionality works as expected

## Test Summary

### Test Results

- **Total Tests Executed**: 12
- **Tests Passed**: 12
- **Tests Failed**: 0
- **Tests Blocked**: 0

### Issues Identified

- None during this test session

### Recommendations

1. Consider adding validation for customer ID and flight ID when creating bookings
2. Improve error handling for file I/O operations
3. Add confirmation messages for successful operations
4. Consider implementing search functionality for each entity
