def call(Map stageParams) {
    echo "$stageParams.branches"
    echo "$stageParams"
    checkout([
        $class: 'scmGIT',
        branches: [[name:  stageParams.name ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
