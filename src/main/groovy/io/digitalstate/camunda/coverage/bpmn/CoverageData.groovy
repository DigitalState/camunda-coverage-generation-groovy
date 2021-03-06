package io.digitalstate.camunda.coverage.bpmn

class CoverageData extends Object {
    public String name
    public Integer weight
    public String bpmnModel
    public Map<String, Integer> activityInstancesFinished
    public ArrayList activityInstancesUnfinished
    public ArrayList sequenceFlowsFinished
    public ArrayList modelAsyncData
    public ArrayList modelUserTasks
    public ArrayList modelExternalTasks
    public ArrayList modelReceiveTasks
    public ArrayList modelIntermediateCatchEvents
    public ArrayList activityInstanceVariableMapping

}

// @TODO make ActivityInstancesUnfinished track the counts of active instances per ActivityId
// @TODO make activityInstanceVariableMapping have a count value of the number of variable activity
