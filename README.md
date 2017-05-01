[![waiting for user feedback](https://img.shields.io/badge/status-waiting_for_user_feedback-yellow.svg)](https://github.com/dnltsk/intellij-mapfile-plugin/issues)

# IntelliJ Mapfile Plugin

https://plugins.jetbrains.com/plugin/9626-mapfile

Editor support for UMN Mapserver Mapfiles. Supported Mapserver version is 7.0

## Features

* ![done](https://img.shields.io/badge/status-done-green.svg) Basic Syntax Validation and Highlighting
* ![done](https://img.shields.io/badge/status-done-green.svg) Autocompletion (Ctrl+Space)
* ![done](https://img.shields.io/badge/status-done-green.svg) Color Picker
* ![done](https://img.shields.io/badge/status-done-green.svg) Folding
* ![in progress](https://img.shields.io/badge/status-in_progress-yellow.svg) Formatter (Cmd+Shift+L)
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) Advanced Syntax Highlighting
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) Templates
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) Annotations (Error Messages)
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) Helpers and Utilities
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) References
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) Find Usages (Alt+F7)
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) Structure View
* ![not started](https://img.shields.io/badge/status-not_started-lightgray.svg) Quick Fix (Alt+Return)
 
![preview](resources/META-INF/preview-screenshot.png "preview")

## Install

1. in your IntelliJ go to _Preferences_ ⌘,
2. in _Plugins_ search for "Mapfile"
3. select _Search in repositories_
4. there you should find the _Mapfile Plugin_
5. restart IntelliJ

## Development

1. comply the [basic prerequisites](http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/prerequisites.html) 
2. clone the repository and import the project into IntelliJ
3. mark the `gen` directory as a `sources root`
4. in the `Run/Debug Configurations` dialog add a new `Configuration`
5. select `Plugin` and configure the correct module
6. Run

## Resources

* Mapfile Documentation<br/>
http://mapserver.org/mapfile/index.html

* Custom Language Support - Tutorial<br/>
http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support_tutorial.html

* Custom Language Support - Architecture Reference Guide<br/> http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support.html

* Backus-Naur Form (BNF) to define the Mapfile's grammar<br/>
https://en.wikipedia.org/wiki/Backus%E2%80%93Naur_form
