#!/usr/bin/env kscript

//org.docopt:docopt:0.6.0-SNAPSHOT
//DEPS  com.offbytwo:docopt:0.6.0.20150202
//DEPS log4j:log4j:1.2.14

import org.docopt.Docopt

// test the docopt dependency
val docopt = Docopt("Usage: jl <command> [options] [<joblist_file>]")

// instantiate a logger to test the log4j dependency
org.apache.log4j.Logger.getRootLogger()

println("kscript is  cool!")