package build.stages

public class buildStage{
    def build( String build ){
        return "this is build stage: ${build}"
    }

    def test( String test ){
        echo "this is test stage: ${test}"
    }

    def deploy( String deployStage ){
        echo "this is test stage: ${deployStage}"
    }

}