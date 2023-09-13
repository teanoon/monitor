FROM openjdk:17-slim-buster

RUN useradd -m -s /bin/bash dev && \
    mkdir -p /workspace /home/dev/.gradle /home/dev/.vscode-server/extensions && \
    chown dev:dev /workspace /home/dev/.gradle /home/dev/.vscode-server/ -R
USER dev
