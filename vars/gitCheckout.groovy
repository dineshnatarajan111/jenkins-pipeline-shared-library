def call(Map stageParams) {
    echo "$stageParams.branch"
    echo "$stageParams"
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.name ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
