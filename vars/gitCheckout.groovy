def call(Map stageParams) {
    echo "$stageParams.branch"
    echo "$stageParams.url"
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
