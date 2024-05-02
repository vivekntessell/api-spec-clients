#!/usr/bin/env bash

set -ex

# Create the destination folder
DEST_FOLDER=$1
mkdir -p $DEST_FOLDER
shift

cd $DEST_FOLDER

# Process the two args at a time.
while (($#)) ;
do
  URL=$1
  shift
  curl $URL -O
done
