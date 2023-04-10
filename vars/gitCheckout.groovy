def call(Map stageParams) {
    echo "$stageParams.branches"
    echo "$stageParams"
    checkout([
        $class: 'GITscm',
        branches: [[name:  stageParams.branches ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
