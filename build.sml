<?xml version="1.0" encoding="UTF-8" standalone="no"?><project basedir="." default="help" name="DansTeam">

<!-- You may freely edit this file. See commented blocks below for -->
<!-- some examples of how to customize the build. -->

    <!--
    
    The master build file lives at: ${sunspot.home}/build.xml.

    If you do not have a Sun SPOT properties file for some reason,
    then you can set the sunspot.home property manually.

        <property name="sunspot.home" value="/opt/sunspot"/>

    The behavior of the build is also controled through properties.
    For example, to use a different source directory, you can set
    the property 'src.dir'.

        <property name="src.dir" value="mysrc"/>

    For a complete listing of properties that are used, and their
    explanations, see the file ${sunspot.home}/default.properties.

    -->

    <property name="user.properties.file" value="build.properties"/>
    <property file="${user.home}/.sunspotfrc.properties"/>
    <import file="${sunspot.home}/build.xml"/>

    <!--

    This file imports the master build file for compiling and deploying sunspot
    applications.  This file provides hooks for the user build file, so that
    you can accomplish almost anything without having to rewrite any of the
    build procedures.  However, if need be, you can just look at the imported
    build file to determine how exactly any step is accomplished.

    Of course, another useful way to find out exactly what is happening is to
    run the targets listed below with ant's 'verbose' flag (ant -v).  This will
    display exactly what is happening at each step.

    Some important targets that are defined within the master build file are:
    (Do "ant help" to see the full list.)

      init:                  initialize and check all properties
      help:                  display useful a help message
      environment            displays information about setting up your environment
      sdk-info               displays information about the current SDK installation
      find-spots             locate USB ports where SPOTs are connected
      info                   displays information about the configuration of a SPOT
      slots                  displays a list of the applications deployed on the SPOT

      clean:                 delete all compiled/generated files
      compile:               compiles java source files to classes
      jar-app                Create a jar for this application
      deploy                 deploy the application to a SPOT as an IMlet
      jar-deploy             deploy an IMlet jar
      run                    connect to a device and watch the application
      debug-run              configure the SPOT ro run the debug agent and then start the debug proxy
      debug-proxy-run        start the proxy for the high-level debugger

    Some useful command line properties:
              	
      -Dbasestation.addr=1234   set the address of the basestation
      -DremoteId=1234           set the target for remote run/deploy/debug-proxy-run
      -Dsquawk.startup.class=com.example.MyStartUp
                                set an alternative startup class name
      -Dspotport=COM2           set the port name for communicating with the SPOT
      -Djar.file=example.jar    set the jar file for jar-app, jar-deploy and make-host-jar
      -Dmidlet=2                select a midlet to run for selectapplication
                                or deploy targets (defaults to 1)
      -Dutility.jars=utils.jar  a classpath separator delimited list of jars to be 
              	                included with the application

    There exist several targets which are by default empty and which can be 
    used for execution of your tasks. These targets are usually executed 
    before and after some main targets. They are defined as follows:

        For each target above (except help),

        -pre-<target>:  called before the target
        -post-<target>: called after the target

    For example, inserting an echo statement after compilation could look like this:

        <target name="-post-compile">
            <echo>Compile finished!</echo>
        </target>    

    For more information on using ant, see http://ant.apache.org.

    -->
</project>
