# IntelliJ Mapfile Plugin

Editor support for UMN Mapserver Mapfiles. Supported Mapserver version is 7.0.4

## Features

* ![in progress](https://img.shields.io/badge/status-in%20progress-yellow.svg) Syntax Validation and Highlighting
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) CLASS
  * ![done](https://img.shields.io/badge/status-done-green.svg) CLUSTER
  * ![done](https://img.shields.io/badge/status-done-green.svg) COMPOSITE
  * ![done](https://img.shields.io/badge/status-done-green.svg) FEATURE
  * ![done](https://img.shields.io/badge/status-done-green.svg) GRID
  * ![done](https://img.shields.io/badge/status-done-green.svg) JOIN
  * ![done](https://img.shields.io/badge/status-done-green.svg) LAYER
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) LABEL
  * ![done](https://img.shields.io/badge/status-done-green.svg) LEGEND
  * ![done](https://img.shields.io/badge/status-done-green.svg) MAP
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) METADATA
  * ![done](https://img.shields.io/badge/status-done-green.svg) PROJECTION
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) QUERYMAP
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) REFERENCE
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) SCALEBAR
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) STYLE
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) SYMBOL
  * ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) VALIDATION
  * ![done](https://img.shields.io/badge/status-done-green.svg) WEB
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) Helpers and Utilities
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) Autocompletion (Ctrl+Space)
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) References
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) Find Usages (Alt+F7)
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) Folding
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) Structure View
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) Formatter (Cmd+Shift+L)
* ![not started](https://img.shields.io/badge/status-not%20started-lightgray.svg) Quick Fix (Cmd+Return)
 
![very early state](resources/META-INF/sneak-preview-screenshot.png "very early state")

## Install

(tbd - not yet uploaded to https://plugins.jetbrains.com/)

## Run

1. comply the [basic prerequisites](http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/prerequisites.html) 
2. clone the repository and import the project into IntelliJ
3. mark the `gen` directory as a `sources root`
4. in the `Run/Debug Configurations` dialog add a new `Configuration`
5. select `Plugin` and configure the correct module
6. Run

## Resources

* Mapfile Documentation<br/>
http://mapserver.org/mapfile/index.html

* Custom Language Support Tutorial<br/>
http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support_tutorial.html

* Backus-Naur Form (BNF) to define the Mapfile's grammar<br/>
https://en.wikipedia.org/wiki/Backus%E2%80%93Naur_form