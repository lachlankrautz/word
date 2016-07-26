#!/usr/bin/env bash

cat src/main/sh/wrapper.sh target/$1.jar > target/$1
chmod +x target/$1