package build.stages

public class buildStage{
    def build( String build ){
        return "this is build stage: ${build}"
    }

    def test( String test ){
        return "this is test stage: ${test}"
    }

    def deploy( String deployStage ){
        return "this is deploy stage: ${deployStage}"
    }

}
