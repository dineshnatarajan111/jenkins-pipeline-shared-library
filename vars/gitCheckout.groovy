def call(Map stageParams) {
    echo "$stageParams.branch"
    echo "$stageParams"
    checkout([
        $class: 'scmGIT',
        branches: [[name:  stageParams.name ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
