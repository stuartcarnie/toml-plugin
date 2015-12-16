# TOML Language Support for IntelliJ

Plugin providing [TOML][toml] support for IntelliJ editors

## Installation

There is currently no release for the plugin just yet. If you are brave enough
and want to use the plugin, you have to build it from source. You need Java 8
and IDEA 15.

Building:

```
$ git clone https://github.com/stuartcarnie/toml-plugin
$ cd toml-plugin
$ ./gradlew buildPlugin
```

This creates a zip archive in `build/distributions` which you can install with
`install plugin from disk` action.

To check which version of Java is used by
  - gradle: run `./gradlew --version`;
  - IDEA: check `Help > About` menu.

## Credits

This plugin was extracted from the [intellij-rust][repo] repository and thus
credit for its development go to the original [authors][]

[toml]: https://github.com/toml-lang/toml/blob/master/README.md
[repo]: https://github.com/intellij-rust/intellij-rust
[authors]: https://github.com/intellij-rust/intellij-rust/blob/da0dcc49f6e7c4dca772aedfdd09925cc021e778/AUTHORS.md

