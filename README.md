# Jetpack Compose Foldable Device Posture Detection Android App

This Android project, built with Jetpack Compose, demonstrates how to dynamically adjust the user interface based on the posture state of foldable devices. The project utilizes `WindowInfoTracker` to monitor the folding feature of foldable devices, detecting postures like `CityPosture`, `Separating`, and `NormalPosture`.

## Purpose

The purpose of this project is to showcase how developers can leverage foldable device features to create adaptive user interfaces using Jetpack Compose. By monitoring the folding state of the device, the app adjusts its layout to provide an optimal user experience for different postures.

## Features

- **Foldable Device Posture Detection**: Utilizes `WindowInfoTracker` to track the folding feature of foldable devices and determine the current posture.
- **Dynamic UI Adaptation with Jetpack Compose**: Leverages Jetpack Compose to create dynamic and adaptive UI layouts based on the detected posture.
- **Ready for Integration**: The project serves as a starting point for developers looking to integrate foldable device posture detection into their Jetpack Compose-based Android applications.

## How to Use

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/pablin202/basic-ui-foldable.git
   ```

2. **Open in Android Studio**:

   Open the project in Android Studio, ensuring that you have the required dependencies, including Jetpack Compose.

3. **Customize Jetpack Compose UIs**:

   Modify the Compose UI code in the `app/src/main/java/com/pdm/traveller/MainActivity.kt` file to tailor the UI for different postures.

4. **Adapt `MainActivity.kt`**:

   Customize the logic in `MainActivity.kt` to handle posture changes and update the Jetpack Compose UI accordingly. Example code is provided in the README to get you started.

5. **Build and Run**:

   Connect a foldable device or start an emulator, then build and run the project to observe the dynamic Jetpack Compose UI adaptation based on the device's posture.

## Dependencies

The project relies on the `WindowInfoTracker` for foldable device posture detection. Ensure that you have the necessary dependencies, including Jetpack Compose, configured in your project.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

Special thanks to the contributors of `WindowInfoTracker` for providing a robust solution for foldable device detection.

Feel free to use, modify, and extend this project according to your needs. If you encounter any issues or have suggestions for improvement, please open an issue or submit a pull request.
