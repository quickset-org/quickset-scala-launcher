[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/quickset-org/quickset-scala-launcher)

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/quickset-org/quickset-scala-launcher)

# Quickset

```bash
$ quickset
Quickset v0.0.1 found local quickset file would you like to import it? [y/N]

$ quickset . 
Quickset v0.0.1 importing .quickset.toml
Installing rust dependency: rustup ---
Installing sqlite dependency: homebrew ---


```


```bash
$ quickset use github.com/onesupercoder/quickset:recipes/scala #(tap and install)
$ quickset tap airbnb/quickset # tap make available 
#tap should be unnecessary because everything should have a tap
```


```toml
#designing format for quickset
#the idea is to allow all development dependencies to be setup

[dependencies]
rust = { tap = "airbnb/quickset", toolchain = "stable" }
sqlite = { version = "latest" }

[cargo]
diesel_cli = { depends-on = ["rust", "sqlite"], features = ["no-default-features", "features sqlite"] }
cargo-edit = {}
```
