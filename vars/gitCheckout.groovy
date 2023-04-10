def call(Map stageParams) {
    echo "$stageParams.branches"
    echo "$stageParams"
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branches ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
