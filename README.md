# YouTube Shorts Automation

This project contains a Java-based Selenium automation script to open YouTube, click on the Shorts section, and change a specified number of Shorts videos.

## Prerequisites

Before running the script, ensure you have the following installed:

1. Java Development Kit (JDK)
2. Selenium WebDriver
3. ChromeDriver

## Steps Performed by the YouTube Shorts Automation Script

1. **Launch Chrome Browser**:
   - The script opens the Chrome browser using Selenium WebDriver.

2. **Navigate to YouTube**:
   - The script directs the browser to the YouTube homepage.

3. **Access the Shorts Section**:
   - The script locates and clicks on the 'Shorts' link to enter the Shorts section of YouTube.

4. **Change Shorts Videos**:
   - The script waits for a few seconds to allow the Shorts video to load.
   - It clicks on the first Shorts video to play it.
   - After a specified duration, it closes the current video and proceeds to the next one.
   - This process is repeated for the specified number of Shorts videos (default is 5).

5. **Close the Browser**:
   - After changing the specified number of Shorts, the script automatically stop.


5. **Change the Number of Shorts**
   - In the script, you can modify the number of Shorts videos you want to change variable.


## Script Overview

- The script opens Chrome and navigates to the YouTube homepage.
- It clicks on the 'Shorts' link to access the Shorts section.
- The script changes the specified number of Shorts videos by clicking on them in sequence.

## Notes

- Ensure your internet connection is stable, as the script requires internet access to load YouTube.
- You can adjust number of shorts as per requirement.
