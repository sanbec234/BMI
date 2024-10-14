# BMI Calculator App

This project is a simple **Body Mass Index (BMI)** Calculator Android app that allows users to input their height and weight to calculate their BMI and provides feedback based on their BMI category.

## Features

- **User Input**: Users can enter their height (in meters) and weight (in kilograms).
- **BMI Calculation**: The app calculates the BMI based on the height and weight entered.
- **Category Classification**: Based on the BMI value, the app provides feedback on whether the user is underweight, normal weight, overweight, or in different classes of obesity.
- **Weight Suggestion**: The app also suggests the amount of weight the user needs to gain or lose to reach a healthy BMI.

## Requirements

- Android Studio (or any compatible IDE)
- Android SDK

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/bmi-calculator.git
    cd bmi-calculator
    ```

2. **Open in Android Studio**:
    - Open Android Studio and select "Open an existing project".
    - Choose the cloned directory.

3. **Build and Run**:
    - Click the "Run" button in Android Studio to build the project and install the app on an emulator or a connected Android device.

## Usage

1. Launch the app on your device.
2. Enter your **height** in meters and **weight** in kilograms.
3. Click the "Calculate BMI" button.
4. The app will display your BMI value along with feedback:
   - **Underweight**: If your BMI is less than 18.5.
   - **Normal Weight**: If your BMI is between 18.5 and 24.9.
   - **Overweight**: If your BMI is between 25 and 29.9.
   - **Obesity Class 1**: If your BMI is between 30 and 34.9.
   - **Obesity Class 2**: If your BMI is between 35 and 39.9.
   - **Obesity Class 3**: If your BMI is above 40.
5. The app will also suggest how many kilograms you need to lose or gain to reach a healthy BMI.

## Example

1. **Input**:
   - Height: 1.75 meters
   - Weight: 85 kg

2. **Output**:
   - BMI Value: 27.76
   - Feedback: "You are overweight. You must lose 12.39 kgs."

## Screenshots

_Include screenshots of your app here (if available)._

## Contributing

If you would like to contribute to this project, feel free to fork the repository and submit a pull request. All contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
