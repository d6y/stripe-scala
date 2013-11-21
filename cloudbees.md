# To Publish to a private CloudBees Maven repository

## Step 1. Mount the release directory

I.e., use Finder and connect to `https://repository-idtp.forge.cloudbees.com/release/`, replacing "idtp" with the name of your project.

## Step 2. Create the package structure

     $ cd /Volumes/release/
     $ cd com/stripe/
     $ mkdir stripe-scala_2.10
     $ cd stripe-scala_2.10/
     $ mkdir 2012.11.07b

..or ensure it exists.

## Step 3: Publish

    $ sbt
    > test
    > publish
    