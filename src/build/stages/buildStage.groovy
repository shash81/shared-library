public class buildStage{
    def build( String build ){
        echo "this is build stage: ${build}"
    }

    def test( String test ){
        echo "this is test stage: ${test}"
    }

    def deploy( String deployStage ){
        echo "this is test stage: ${deployStage}"
    }

}