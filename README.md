# CS1710 - Assignment 4

## Overview

Answers to "Part I: Tracing" can be found in `PartI/Trace*.md`.

Answers to "Part II: Programming Exercises" can be found in `PartII/src/*.java`.

## Exporting

To export to a .zip from the repository, run the following.

`rm -i *.zip; git gc --aggressive --prune=now && git archive HEAD --format=zip -9 > "$(printf "r%s.%s - %s - %s.zip" "$(git rev-list --count HEAD)" "$(git rev-parse --short HEAD)" "$(TZ='Canada/Newfoundland' date --iso-8601=seconds)" "$(git --no-pager show -s --format='%an' HEAD)" | sed s/:/./g)"`

*Warning: This will try to remove all zip files, regardless of name.*

Also, an updated .zip can always be found on my [GitHub account](https://github.com/Manouchehri/).
