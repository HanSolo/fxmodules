## FX Modules 

<br>

This is a little project that can be used as a template for modularized JavaFX projects.
The main branch is based on JDK17, other version could be find in separate branches (e.g. jdk11)

You should be able to import the build.gradle file as a project into your IDE and start the
application by using ```gradlew Main``` from the command line or from within the IDE.

You will find three script files 
- build_app_windows.bat
- build_app_macos.sh
- build_app_linux.sh

which can be used to build native packages and installers on the platform of your choice.
If you would like to build a native package on MacOS you need to perform the following steps:
- ```./gradlew clean build```
- ```bash build_app_macos.sh```

After the script has finished you will find the dmg, the pkg and the app file in the folder

```fxmodules/build/installer```

In addition the project also comes with a github action in the folder

```fxmodules/.github/workflows```

The ```ci.yml``` file will build the native packages for each platform on github
after each push to the project.
The artifacts will be attached to the build so that you can download it from there.