FROM gitpod/workspace-full

RUN sudo sh -c '(echo "#!/usr/bin/env sh" && curl -L https://github.com/lihaoyi/Ammonite/releases/download/2.3.8/2.12-2.3.8) > /usr/local/bin/amm && chmod +x /usr/local/bin/amm'

RUN brew install scala coursier/formulas/coursier sbt scalaenv

RUN scalaenv install scala-2.13.4 && scalaenv global scala-2.13.4