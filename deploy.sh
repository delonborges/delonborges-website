#!/usr/bin/env sh
# abort on errors
set -e

git config --global init.defaultBranch main
git config --global user.email "delon.borges@icloud.com"
git config --global user.name "Delon Borges"
# build
npm run build
# navigate into the build output directory
cd dist
# if you are deploying to a custom domain
echo 'delonborges.com' > CNAME
git init
git add -A
git commit -m 'deploy'
git push -f git@github.com:delonborges/delonborges-website.git main:gh-pages
cd -
