# pass-generator

Simple password generator written in Clojure with CLI interface.

## Development

This project uses leiningen, so you can run it with lein.
To create uberjar, just do:
```
lein uberjar
```
And you can run it with:
```
java -jar target/pass-generator-0.1.0-SNAPSHOT-standalone.jar --help

  -l, --length LENGTH  8  Password length
  -h, --help
```
