package com.ink.inkojsandbox.service.impl;



import com.ink.inkojsandbox.model.dto.ExecuteCodeRequest;
import com.ink.inkojsandbox.model.dto.ExecuteCodeResponse;
import com.ink.inkojsandbox.model.dto.JudgeInfo;
import com.ink.inkojsandbox.model.enums.JudgeInfoEnum;
import com.ink.inkojsandbox.model.enums.QuestionSubmitEnum;
import com.ink.inkojsandbox.service.CodeSandbox;

import java.util.List;

/**
 * 代码沙箱例子，模拟一下代码杀向的执行
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("事例代码沙箱");
        List<String> inputList = executeCodeRequest.getInput();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("代码执行成功");
        executeCodeResponse.setStatus(QuestionSubmitEnum.SUCCESS.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoEnum.ACCEPTED.getValue());
        judgeInfo.setTime(100L);
        judgeInfo.setMemory(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
