FROM ubuntu:latest

ENV DEBIAN_FRONTEND noninteractive
RUN apt update && apt install -y sudo git build-essential gdb
ENV DEBIAN_FRONTEND dialog

ENV USER dev
ENV HOME /home/${USER}
ENV SHELL /bin/bash

RUN useradd -m ${USER} && gpasswd -a ${USER} sudo \
    && echo "${USER}:pass" | chpasswd \
    && echo "root:pass" | chpasswd \
    && echo "${USER} ALL=(ALL) ALL" >> /etc/sudoers \
    && sed -i.bak "s#${HOME}:#${HOME}:${SHELL}#" /etc/passwd

USER dev
ENV HOME /home/dev
ENTRYPOINT tail -f /dev/null