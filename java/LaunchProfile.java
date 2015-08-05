// ***************************************************************************
//
// Copyright (c) 2000 - 2015, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-442911
// All rights reserved.
//
// This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or other materials provided with the distribution.
//  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
//    be used to endorse or promote products derived from this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
// LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
// DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit;

import java.util.Vector;
import java.lang.Integer;

// ****************************************************************************
// Class: LaunchProfile
//
// Purpose:
//    This class contains information needed to launch a VisIt engine.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class LaunchProfile extends AttributeSubject
{
    private static int LaunchProfile_numAdditionalAtts = 38;

    public LaunchProfile()
    {
        super(LaunchProfile_numAdditionalAtts);

        profileName = new String("notset");
        timeout = 480;
        numProcessors = 1;
        numNodesSet = false;
        numNodes = 1;
        partitionSet = false;
        partition = new String("");
        bankSet = false;
        bank = new String("");
        timeLimitSet = false;
        timeLimit = new String("");
        launchMethodSet = false;
        launchMethod = new String("");
        forceStatic = true;
        forceDynamic = false;
        active = false;
        arguments = new Vector();
        parallel = false;
        launchArgsSet = false;
        launchArgs = new String("");
        sublaunchArgsSet = false;
        sublaunchArgs = new String("");
        sublaunchPreCmdSet = false;
        sublaunchPreCmd = new String("");
        sublaunchPostCmdSet = false;
        sublaunchPostCmd = new String("");
        machinefileSet = false;
        machinefile = new String("");
        visitSetsUpEnv = false;
        canDoHWAccel = false;
        GPUsPerNode = 1;
        XArguments = new String("");
        launchXServers = false;
        XDisplay = new String(":%l");
        numThreads = 0;
        constrainNodeProcs = false;
        allowableNodes = new Vector();
        allowableProcs = new Vector();
    }

    public LaunchProfile(int nMoreFields)
    {
        super(LaunchProfile_numAdditionalAtts + nMoreFields);

        profileName = new String("notset");
        timeout = 480;
        numProcessors = 1;
        numNodesSet = false;
        numNodes = 1;
        partitionSet = false;
        partition = new String("");
        bankSet = false;
        bank = new String("");
        timeLimitSet = false;
        timeLimit = new String("");
        launchMethodSet = false;
        launchMethod = new String("");
        forceStatic = true;
        forceDynamic = false;
        active = false;
        arguments = new Vector();
        parallel = false;
        launchArgsSet = false;
        launchArgs = new String("");
        sublaunchArgsSet = false;
        sublaunchArgs = new String("");
        sublaunchPreCmdSet = false;
        sublaunchPreCmd = new String("");
        sublaunchPostCmdSet = false;
        sublaunchPostCmd = new String("");
        machinefileSet = false;
        machinefile = new String("");
        visitSetsUpEnv = false;
        canDoHWAccel = false;
        GPUsPerNode = 1;
        XArguments = new String("");
        launchXServers = false;
        XDisplay = new String(":%l");
        numThreads = 0;
        constrainNodeProcs = false;
        allowableNodes = new Vector();
        allowableProcs = new Vector();
    }

    public LaunchProfile(LaunchProfile obj)
    {
        super(LaunchProfile_numAdditionalAtts);

        int i;

        profileName = new String(obj.profileName);
        timeout = obj.timeout;
        numProcessors = obj.numProcessors;
        numNodesSet = obj.numNodesSet;
        numNodes = obj.numNodes;
        partitionSet = obj.partitionSet;
        partition = new String(obj.partition);
        bankSet = obj.bankSet;
        bank = new String(obj.bank);
        timeLimitSet = obj.timeLimitSet;
        timeLimit = new String(obj.timeLimit);
        launchMethodSet = obj.launchMethodSet;
        launchMethod = new String(obj.launchMethod);
        forceStatic = obj.forceStatic;
        forceDynamic = obj.forceDynamic;
        active = obj.active;
        arguments = new Vector(obj.arguments.size());
        for(i = 0; i < obj.arguments.size(); ++i)
            arguments.addElement(new String((String)obj.arguments.elementAt(i)));

        parallel = obj.parallel;
        launchArgsSet = obj.launchArgsSet;
        launchArgs = new String(obj.launchArgs);
        sublaunchArgsSet = obj.sublaunchArgsSet;
        sublaunchArgs = new String(obj.sublaunchArgs);
        sublaunchPreCmdSet = obj.sublaunchPreCmdSet;
        sublaunchPreCmd = new String(obj.sublaunchPreCmd);
        sublaunchPostCmdSet = obj.sublaunchPostCmdSet;
        sublaunchPostCmd = new String(obj.sublaunchPostCmd);
        machinefileSet = obj.machinefileSet;
        machinefile = new String(obj.machinefile);
        visitSetsUpEnv = obj.visitSetsUpEnv;
        canDoHWAccel = obj.canDoHWAccel;
        GPUsPerNode = obj.GPUsPerNode;
        XArguments = new String(obj.XArguments);
        launchXServers = obj.launchXServers;
        XDisplay = new String(obj.XDisplay);
        numThreads = obj.numThreads;
        constrainNodeProcs = obj.constrainNodeProcs;
        allowableNodes = new Vector();
        for(i = 0; i < obj.allowableNodes.size(); ++i)
        {
            Integer iv = (Integer)obj.allowableNodes.elementAt(i);
            allowableNodes.addElement(new Integer(iv.intValue()));
        }
        allowableProcs = new Vector();
        for(i = 0; i < obj.allowableProcs.size(); ++i)
        {
            Integer iv = (Integer)obj.allowableProcs.elementAt(i);
            allowableProcs.addElement(new Integer(iv.intValue()));
        }

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return LaunchProfile_numAdditionalAtts;
    }

    public boolean equals(LaunchProfile obj)
    {
        int i;

        // Compare the elements in the arguments vector.
        boolean arguments_equal = (obj.arguments.size() == arguments.size());
        for(i = 0; (i < arguments.size()) && arguments_equal; ++i)
        {
            // Make references to String from Object.
            String arguments1 = (String)arguments.elementAt(i);
            String arguments2 = (String)obj.arguments.elementAt(i);
            arguments_equal = arguments1.equals(arguments2);
        }
        // Compare the elements in the allowableNodes vector.
        boolean allowableNodes_equal = (obj.allowableNodes.size() == allowableNodes.size());
        for(i = 0; (i < allowableNodes.size()) && allowableNodes_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer allowableNodes1 = (Integer)allowableNodes.elementAt(i);
            Integer allowableNodes2 = (Integer)obj.allowableNodes.elementAt(i);
            allowableNodes_equal = allowableNodes1.equals(allowableNodes2);
        }
        // Compare the elements in the allowableProcs vector.
        boolean allowableProcs_equal = (obj.allowableProcs.size() == allowableProcs.size());
        for(i = 0; (i < allowableProcs.size()) && allowableProcs_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer allowableProcs1 = (Integer)allowableProcs.elementAt(i);
            Integer allowableProcs2 = (Integer)obj.allowableProcs.elementAt(i);
            allowableProcs_equal = allowableProcs1.equals(allowableProcs2);
        }
        // Create the return value
        return ((profileName.equals(obj.profileName)) &&
                (timeout == obj.timeout) &&
                (numProcessors == obj.numProcessors) &&
                (numNodesSet == obj.numNodesSet) &&
                (numNodes == obj.numNodes) &&
                (partitionSet == obj.partitionSet) &&
                (partition.equals(obj.partition)) &&
                (bankSet == obj.bankSet) &&
                (bank.equals(obj.bank)) &&
                (timeLimitSet == obj.timeLimitSet) &&
                (timeLimit.equals(obj.timeLimit)) &&
                (launchMethodSet == obj.launchMethodSet) &&
                (launchMethod.equals(obj.launchMethod)) &&
                (forceStatic == obj.forceStatic) &&
                (forceDynamic == obj.forceDynamic) &&
                (active == obj.active) &&
                arguments_equal &&
                (parallel == obj.parallel) &&
                (launchArgsSet == obj.launchArgsSet) &&
                (launchArgs.equals(obj.launchArgs)) &&
                (sublaunchArgsSet == obj.sublaunchArgsSet) &&
                (sublaunchArgs.equals(obj.sublaunchArgs)) &&
                (sublaunchPreCmdSet == obj.sublaunchPreCmdSet) &&
                (sublaunchPreCmd.equals(obj.sublaunchPreCmd)) &&
                (sublaunchPostCmdSet == obj.sublaunchPostCmdSet) &&
                (sublaunchPostCmd.equals(obj.sublaunchPostCmd)) &&
                (machinefileSet == obj.machinefileSet) &&
                (machinefile.equals(obj.machinefile)) &&
                (visitSetsUpEnv == obj.visitSetsUpEnv) &&
                (canDoHWAccel == obj.canDoHWAccel) &&
                (GPUsPerNode == obj.GPUsPerNode) &&
                (XArguments.equals(obj.XArguments)) &&
                (launchXServers == obj.launchXServers) &&
                (XDisplay.equals(obj.XDisplay)) &&
                (numThreads == obj.numThreads) &&
                (constrainNodeProcs == obj.constrainNodeProcs) &&
                allowableNodes_equal &&
                allowableProcs_equal);
    }

    // Property setting methods
    public void SetProfileName(String profileName_)
    {
        profileName = profileName_;
        Select(0);
    }

    public void SetTimeout(int timeout_)
    {
        timeout = timeout_;
        Select(1);
    }

    public void SetNumProcessors(int numProcessors_)
    {
        numProcessors = numProcessors_;
        Select(2);
    }

    public void SetNumNodesSet(boolean numNodesSet_)
    {
        numNodesSet = numNodesSet_;
        Select(3);
    }

    public void SetNumNodes(int numNodes_)
    {
        numNodes = numNodes_;
        Select(4);
    }

    public void SetPartitionSet(boolean partitionSet_)
    {
        partitionSet = partitionSet_;
        Select(5);
    }

    public void SetPartition(String partition_)
    {
        partition = partition_;
        Select(6);
    }

    public void SetBankSet(boolean bankSet_)
    {
        bankSet = bankSet_;
        Select(7);
    }

    public void SetBank(String bank_)
    {
        bank = bank_;
        Select(8);
    }

    public void SetTimeLimitSet(boolean timeLimitSet_)
    {
        timeLimitSet = timeLimitSet_;
        Select(9);
    }

    public void SetTimeLimit(String timeLimit_)
    {
        timeLimit = timeLimit_;
        Select(10);
    }

    public void SetLaunchMethodSet(boolean launchMethodSet_)
    {
        launchMethodSet = launchMethodSet_;
        Select(11);
    }

    public void SetLaunchMethod(String launchMethod_)
    {
        launchMethod = launchMethod_;
        Select(12);
    }

    public void SetForceStatic(boolean forceStatic_)
    {
        forceStatic = forceStatic_;
        Select(13);
    }

    public void SetForceDynamic(boolean forceDynamic_)
    {
        forceDynamic = forceDynamic_;
        Select(14);
    }

    public void SetActive(boolean active_)
    {
        active = active_;
        Select(15);
    }

    public void SetArguments(Vector arguments_)
    {
        arguments = arguments_;
        Select(16);
    }

    public void SetParallel(boolean parallel_)
    {
        parallel = parallel_;
        Select(17);
    }

    public void SetLaunchArgsSet(boolean launchArgsSet_)
    {
        launchArgsSet = launchArgsSet_;
        Select(18);
    }

    public void SetLaunchArgs(String launchArgs_)
    {
        launchArgs = launchArgs_;
        Select(19);
    }

    public void SetSublaunchArgsSet(boolean sublaunchArgsSet_)
    {
        sublaunchArgsSet = sublaunchArgsSet_;
        Select(20);
    }

    public void SetSublaunchArgs(String sublaunchArgs_)
    {
        sublaunchArgs = sublaunchArgs_;
        Select(21);
    }

    public void SetSublaunchPreCmdSet(boolean sublaunchPreCmdSet_)
    {
        sublaunchPreCmdSet = sublaunchPreCmdSet_;
        Select(22);
    }

    public void SetSublaunchPreCmd(String sublaunchPreCmd_)
    {
        sublaunchPreCmd = sublaunchPreCmd_;
        Select(23);
    }

    public void SetSublaunchPostCmdSet(boolean sublaunchPostCmdSet_)
    {
        sublaunchPostCmdSet = sublaunchPostCmdSet_;
        Select(24);
    }

    public void SetSublaunchPostCmd(String sublaunchPostCmd_)
    {
        sublaunchPostCmd = sublaunchPostCmd_;
        Select(25);
    }

    public void SetMachinefileSet(boolean machinefileSet_)
    {
        machinefileSet = machinefileSet_;
        Select(26);
    }

    public void SetMachinefile(String machinefile_)
    {
        machinefile = machinefile_;
        Select(27);
    }

    public void SetVisitSetsUpEnv(boolean visitSetsUpEnv_)
    {
        visitSetsUpEnv = visitSetsUpEnv_;
        Select(28);
    }

    public void SetCanDoHWAccel(boolean canDoHWAccel_)
    {
        canDoHWAccel = canDoHWAccel_;
        Select(29);
    }

    public void SetGPUsPerNode(int GPUsPerNode_)
    {
        GPUsPerNode = GPUsPerNode_;
        Select(30);
    }

    public void SetXArguments(String XArguments_)
    {
        XArguments = XArguments_;
        Select(31);
    }

    public void SetLaunchXServers(boolean launchXServers_)
    {
        launchXServers = launchXServers_;
        Select(32);
    }

    public void SetXDisplay(String XDisplay_)
    {
        XDisplay = XDisplay_;
        Select(33);
    }

    public void SetNumThreads(int numThreads_)
    {
        numThreads = numThreads_;
        Select(34);
    }

    public void SetConstrainNodeProcs(boolean constrainNodeProcs_)
    {
        constrainNodeProcs = constrainNodeProcs_;
        Select(35);
    }

    public void SetAllowableNodes(Vector allowableNodes_)
    {
        allowableNodes = allowableNodes_;
        Select(36);
    }

    public void SetAllowableProcs(Vector allowableProcs_)
    {
        allowableProcs = allowableProcs_;
        Select(37);
    }

    // Property getting methods
    public String  GetProfileName() { return profileName; }
    public int     GetTimeout() { return timeout; }
    public int     GetNumProcessors() { return numProcessors; }
    public boolean GetNumNodesSet() { return numNodesSet; }
    public int     GetNumNodes() { return numNodes; }
    public boolean GetPartitionSet() { return partitionSet; }
    public String  GetPartition() { return partition; }
    public boolean GetBankSet() { return bankSet; }
    public String  GetBank() { return bank; }
    public boolean GetTimeLimitSet() { return timeLimitSet; }
    public String  GetTimeLimit() { return timeLimit; }
    public boolean GetLaunchMethodSet() { return launchMethodSet; }
    public String  GetLaunchMethod() { return launchMethod; }
    public boolean GetForceStatic() { return forceStatic; }
    public boolean GetForceDynamic() { return forceDynamic; }
    public boolean GetActive() { return active; }
    public Vector  GetArguments() { return arguments; }
    public boolean GetParallel() { return parallel; }
    public boolean GetLaunchArgsSet() { return launchArgsSet; }
    public String  GetLaunchArgs() { return launchArgs; }
    public boolean GetSublaunchArgsSet() { return sublaunchArgsSet; }
    public String  GetSublaunchArgs() { return sublaunchArgs; }
    public boolean GetSublaunchPreCmdSet() { return sublaunchPreCmdSet; }
    public String  GetSublaunchPreCmd() { return sublaunchPreCmd; }
    public boolean GetSublaunchPostCmdSet() { return sublaunchPostCmdSet; }
    public String  GetSublaunchPostCmd() { return sublaunchPostCmd; }
    public boolean GetMachinefileSet() { return machinefileSet; }
    public String  GetMachinefile() { return machinefile; }
    public boolean GetVisitSetsUpEnv() { return visitSetsUpEnv; }
    public boolean GetCanDoHWAccel() { return canDoHWAccel; }
    public int     GetGPUsPerNode() { return GPUsPerNode; }
    public String  GetXArguments() { return XArguments; }
    public boolean GetLaunchXServers() { return launchXServers; }
    public String  GetXDisplay() { return XDisplay; }
    public int     GetNumThreads() { return numThreads; }
    public boolean GetConstrainNodeProcs() { return constrainNodeProcs; }
    public Vector  GetAllowableNodes() { return allowableNodes; }
    public Vector  GetAllowableProcs() { return allowableProcs; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteString(profileName);
        if(WriteSelect(1, buf))
            buf.WriteInt(timeout);
        if(WriteSelect(2, buf))
            buf.WriteInt(numProcessors);
        if(WriteSelect(3, buf))
            buf.WriteBool(numNodesSet);
        if(WriteSelect(4, buf))
            buf.WriteInt(numNodes);
        if(WriteSelect(5, buf))
            buf.WriteBool(partitionSet);
        if(WriteSelect(6, buf))
            buf.WriteString(partition);
        if(WriteSelect(7, buf))
            buf.WriteBool(bankSet);
        if(WriteSelect(8, buf))
            buf.WriteString(bank);
        if(WriteSelect(9, buf))
            buf.WriteBool(timeLimitSet);
        if(WriteSelect(10, buf))
            buf.WriteString(timeLimit);
        if(WriteSelect(11, buf))
            buf.WriteBool(launchMethodSet);
        if(WriteSelect(12, buf))
            buf.WriteString(launchMethod);
        if(WriteSelect(13, buf))
            buf.WriteBool(forceStatic);
        if(WriteSelect(14, buf))
            buf.WriteBool(forceDynamic);
        if(WriteSelect(15, buf))
            buf.WriteBool(active);
        if(WriteSelect(16, buf))
            buf.WriteStringVector(arguments);
        if(WriteSelect(17, buf))
            buf.WriteBool(parallel);
        if(WriteSelect(18, buf))
            buf.WriteBool(launchArgsSet);
        if(WriteSelect(19, buf))
            buf.WriteString(launchArgs);
        if(WriteSelect(20, buf))
            buf.WriteBool(sublaunchArgsSet);
        if(WriteSelect(21, buf))
            buf.WriteString(sublaunchArgs);
        if(WriteSelect(22, buf))
            buf.WriteBool(sublaunchPreCmdSet);
        if(WriteSelect(23, buf))
            buf.WriteString(sublaunchPreCmd);
        if(WriteSelect(24, buf))
            buf.WriteBool(sublaunchPostCmdSet);
        if(WriteSelect(25, buf))
            buf.WriteString(sublaunchPostCmd);
        if(WriteSelect(26, buf))
            buf.WriteBool(machinefileSet);
        if(WriteSelect(27, buf))
            buf.WriteString(machinefile);
        if(WriteSelect(28, buf))
            buf.WriteBool(visitSetsUpEnv);
        if(WriteSelect(29, buf))
            buf.WriteBool(canDoHWAccel);
        if(WriteSelect(30, buf))
            buf.WriteInt(GPUsPerNode);
        if(WriteSelect(31, buf))
            buf.WriteString(XArguments);
        if(WriteSelect(32, buf))
            buf.WriteBool(launchXServers);
        if(WriteSelect(33, buf))
            buf.WriteString(XDisplay);
        if(WriteSelect(34, buf))
            buf.WriteInt(numThreads);
        if(WriteSelect(35, buf))
            buf.WriteBool(constrainNodeProcs);
        if(WriteSelect(36, buf))
            buf.WriteIntVector(allowableNodes);
        if(WriteSelect(37, buf))
            buf.WriteIntVector(allowableProcs);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetProfileName(buf.ReadString());
            break;
        case 1:
            SetTimeout(buf.ReadInt());
            break;
        case 2:
            SetNumProcessors(buf.ReadInt());
            break;
        case 3:
            SetNumNodesSet(buf.ReadBool());
            break;
        case 4:
            SetNumNodes(buf.ReadInt());
            break;
        case 5:
            SetPartitionSet(buf.ReadBool());
            break;
        case 6:
            SetPartition(buf.ReadString());
            break;
        case 7:
            SetBankSet(buf.ReadBool());
            break;
        case 8:
            SetBank(buf.ReadString());
            break;
        case 9:
            SetTimeLimitSet(buf.ReadBool());
            break;
        case 10:
            SetTimeLimit(buf.ReadString());
            break;
        case 11:
            SetLaunchMethodSet(buf.ReadBool());
            break;
        case 12:
            SetLaunchMethod(buf.ReadString());
            break;
        case 13:
            SetForceStatic(buf.ReadBool());
            break;
        case 14:
            SetForceDynamic(buf.ReadBool());
            break;
        case 15:
            SetActive(buf.ReadBool());
            break;
        case 16:
            SetArguments(buf.ReadStringVector());
            break;
        case 17:
            SetParallel(buf.ReadBool());
            break;
        case 18:
            SetLaunchArgsSet(buf.ReadBool());
            break;
        case 19:
            SetLaunchArgs(buf.ReadString());
            break;
        case 20:
            SetSublaunchArgsSet(buf.ReadBool());
            break;
        case 21:
            SetSublaunchArgs(buf.ReadString());
            break;
        case 22:
            SetSublaunchPreCmdSet(buf.ReadBool());
            break;
        case 23:
            SetSublaunchPreCmd(buf.ReadString());
            break;
        case 24:
            SetSublaunchPostCmdSet(buf.ReadBool());
            break;
        case 25:
            SetSublaunchPostCmd(buf.ReadString());
            break;
        case 26:
            SetMachinefileSet(buf.ReadBool());
            break;
        case 27:
            SetMachinefile(buf.ReadString());
            break;
        case 28:
            SetVisitSetsUpEnv(buf.ReadBool());
            break;
        case 29:
            SetCanDoHWAccel(buf.ReadBool());
            break;
        case 30:
            SetGPUsPerNode(buf.ReadInt());
            break;
        case 31:
            SetXArguments(buf.ReadString());
            break;
        case 32:
            SetLaunchXServers(buf.ReadBool());
            break;
        case 33:
            SetXDisplay(buf.ReadString());
            break;
        case 34:
            SetNumThreads(buf.ReadInt());
            break;
        case 35:
            SetConstrainNodeProcs(buf.ReadBool());
            break;
        case 36:
            SetAllowableNodes(buf.ReadIntVector());
            break;
        case 37:
            SetAllowableProcs(buf.ReadIntVector());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + stringToString("profileName", profileName, indent) + "\n";
        str = str + intToString("timeout", timeout, indent) + "\n";
        str = str + intToString("numProcessors", numProcessors, indent) + "\n";
        str = str + boolToString("numNodesSet", numNodesSet, indent) + "\n";
        str = str + intToString("numNodes", numNodes, indent) + "\n";
        str = str + boolToString("partitionSet", partitionSet, indent) + "\n";
        str = str + stringToString("partition", partition, indent) + "\n";
        str = str + boolToString("bankSet", bankSet, indent) + "\n";
        str = str + stringToString("bank", bank, indent) + "\n";
        str = str + boolToString("timeLimitSet", timeLimitSet, indent) + "\n";
        str = str + stringToString("timeLimit", timeLimit, indent) + "\n";
        str = str + boolToString("launchMethodSet", launchMethodSet, indent) + "\n";
        str = str + stringToString("launchMethod", launchMethod, indent) + "\n";
        str = str + boolToString("forceStatic", forceStatic, indent) + "\n";
        str = str + boolToString("forceDynamic", forceDynamic, indent) + "\n";
        str = str + boolToString("active", active, indent) + "\n";
        str = str + stringVectorToString("arguments", arguments, indent) + "\n";
        str = str + boolToString("parallel", parallel, indent) + "\n";
        str = str + boolToString("launchArgsSet", launchArgsSet, indent) + "\n";
        str = str + stringToString("launchArgs", launchArgs, indent) + "\n";
        str = str + boolToString("sublaunchArgsSet", sublaunchArgsSet, indent) + "\n";
        str = str + stringToString("sublaunchArgs", sublaunchArgs, indent) + "\n";
        str = str + boolToString("sublaunchPreCmdSet", sublaunchPreCmdSet, indent) + "\n";
        str = str + stringToString("sublaunchPreCmd", sublaunchPreCmd, indent) + "\n";
        str = str + boolToString("sublaunchPostCmdSet", sublaunchPostCmdSet, indent) + "\n";
        str = str + stringToString("sublaunchPostCmd", sublaunchPostCmd, indent) + "\n";
        str = str + boolToString("machinefileSet", machinefileSet, indent) + "\n";
        str = str + stringToString("machinefile", machinefile, indent) + "\n";
        str = str + boolToString("visitSetsUpEnv", visitSetsUpEnv, indent) + "\n";
        str = str + boolToString("canDoHWAccel", canDoHWAccel, indent) + "\n";
        str = str + intToString("GPUsPerNode", GPUsPerNode, indent) + "\n";
        str = str + stringToString("XArguments", XArguments, indent) + "\n";
        str = str + boolToString("launchXServers", launchXServers, indent) + "\n";
        str = str + stringToString("XDisplay", XDisplay, indent) + "\n";
        str = str + intToString("numThreads", numThreads, indent) + "\n";
        str = str + boolToString("constrainNodeProcs", constrainNodeProcs, indent) + "\n";
        str = str + intVectorToString("allowableNodes", allowableNodes, indent) + "\n";
        str = str + intVectorToString("allowableProcs", allowableProcs, indent) + "\n";
        return str;
    }


    // Attributes
    private String  profileName;
    private int     timeout;
    private int     numProcessors;
    private boolean numNodesSet;
    private int     numNodes;
    private boolean partitionSet;
    private String  partition;
    private boolean bankSet;
    private String  bank;
    private boolean timeLimitSet;
    private String  timeLimit;
    private boolean launchMethodSet;
    private String  launchMethod;
    private boolean forceStatic;
    private boolean forceDynamic;
    private boolean active;
    private Vector  arguments; // vector of String objects
    private boolean parallel;
    private boolean launchArgsSet;
    private String  launchArgs;
    private boolean sublaunchArgsSet;
    private String  sublaunchArgs;
    private boolean sublaunchPreCmdSet;
    private String  sublaunchPreCmd;
    private boolean sublaunchPostCmdSet;
    private String  sublaunchPostCmd;
    private boolean machinefileSet;
    private String  machinefile;
    private boolean visitSetsUpEnv;
    private boolean canDoHWAccel;
    private int     GPUsPerNode;
    private String  XArguments;
    private boolean launchXServers;
    private String  XDisplay;
    private int     numThreads;
    private boolean constrainNodeProcs;
    private Vector  allowableNodes; // vector of Integer objects
    private Vector  allowableProcs; // vector of Integer objects
}

