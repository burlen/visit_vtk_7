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

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: InverseGhostZoneAttributes
//
// Purpose:
//    This class contains attributes for the inverse ghost zone operator.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class InverseGhostZoneAttributes extends AttributeSubject implements Plugin
{
    private static int InverseGhostZoneAttributes_numAdditionalAtts = 7;

    public InverseGhostZoneAttributes()
    {
        super(InverseGhostZoneAttributes_numAdditionalAtts);

        requestGhostZones = true;
        showDuplicated = true;
        showEnhancedConnectivity = true;
        showReducedConnectivity = true;
        showAMRRefined = true;
        showExterior = true;
        showNotApplicable = true;
    }

    public InverseGhostZoneAttributes(int nMoreFields)
    {
        super(InverseGhostZoneAttributes_numAdditionalAtts + nMoreFields);

        requestGhostZones = true;
        showDuplicated = true;
        showEnhancedConnectivity = true;
        showReducedConnectivity = true;
        showAMRRefined = true;
        showExterior = true;
        showNotApplicable = true;
    }

    public InverseGhostZoneAttributes(InverseGhostZoneAttributes obj)
    {
        super(InverseGhostZoneAttributes_numAdditionalAtts);

        requestGhostZones = obj.requestGhostZones;
        showDuplicated = obj.showDuplicated;
        showEnhancedConnectivity = obj.showEnhancedConnectivity;
        showReducedConnectivity = obj.showReducedConnectivity;
        showAMRRefined = obj.showAMRRefined;
        showExterior = obj.showExterior;
        showNotApplicable = obj.showNotApplicable;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return InverseGhostZoneAttributes_numAdditionalAtts;
    }

    public boolean equals(InverseGhostZoneAttributes obj)
    {
        // Create the return value
        return ((requestGhostZones == obj.requestGhostZones) &&
                (showDuplicated == obj.showDuplicated) &&
                (showEnhancedConnectivity == obj.showEnhancedConnectivity) &&
                (showReducedConnectivity == obj.showReducedConnectivity) &&
                (showAMRRefined == obj.showAMRRefined) &&
                (showExterior == obj.showExterior) &&
                (showNotApplicable == obj.showNotApplicable));
    }

    public String GetName() { return "InverseGhostZone"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetRequestGhostZones(boolean requestGhostZones_)
    {
        requestGhostZones = requestGhostZones_;
        Select(0);
    }

    public void SetShowDuplicated(boolean showDuplicated_)
    {
        showDuplicated = showDuplicated_;
        Select(1);
    }

    public void SetShowEnhancedConnectivity(boolean showEnhancedConnectivity_)
    {
        showEnhancedConnectivity = showEnhancedConnectivity_;
        Select(2);
    }

    public void SetShowReducedConnectivity(boolean showReducedConnectivity_)
    {
        showReducedConnectivity = showReducedConnectivity_;
        Select(3);
    }

    public void SetShowAMRRefined(boolean showAMRRefined_)
    {
        showAMRRefined = showAMRRefined_;
        Select(4);
    }

    public void SetShowExterior(boolean showExterior_)
    {
        showExterior = showExterior_;
        Select(5);
    }

    public void SetShowNotApplicable(boolean showNotApplicable_)
    {
        showNotApplicable = showNotApplicable_;
        Select(6);
    }

    // Property getting methods
    public boolean GetRequestGhostZones() { return requestGhostZones; }
    public boolean GetShowDuplicated() { return showDuplicated; }
    public boolean GetShowEnhancedConnectivity() { return showEnhancedConnectivity; }
    public boolean GetShowReducedConnectivity() { return showReducedConnectivity; }
    public boolean GetShowAMRRefined() { return showAMRRefined; }
    public boolean GetShowExterior() { return showExterior; }
    public boolean GetShowNotApplicable() { return showNotApplicable; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(requestGhostZones);
        if(WriteSelect(1, buf))
            buf.WriteBool(showDuplicated);
        if(WriteSelect(2, buf))
            buf.WriteBool(showEnhancedConnectivity);
        if(WriteSelect(3, buf))
            buf.WriteBool(showReducedConnectivity);
        if(WriteSelect(4, buf))
            buf.WriteBool(showAMRRefined);
        if(WriteSelect(5, buf))
            buf.WriteBool(showExterior);
        if(WriteSelect(6, buf))
            buf.WriteBool(showNotApplicable);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetRequestGhostZones(buf.ReadBool());
            break;
        case 1:
            SetShowDuplicated(buf.ReadBool());
            break;
        case 2:
            SetShowEnhancedConnectivity(buf.ReadBool());
            break;
        case 3:
            SetShowReducedConnectivity(buf.ReadBool());
            break;
        case 4:
            SetShowAMRRefined(buf.ReadBool());
            break;
        case 5:
            SetShowExterior(buf.ReadBool());
            break;
        case 6:
            SetShowNotApplicable(buf.ReadBool());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + boolToString("requestGhostZones", requestGhostZones, indent) + "\n";
        str = str + boolToString("showDuplicated", showDuplicated, indent) + "\n";
        str = str + boolToString("showEnhancedConnectivity", showEnhancedConnectivity, indent) + "\n";
        str = str + boolToString("showReducedConnectivity", showReducedConnectivity, indent) + "\n";
        str = str + boolToString("showAMRRefined", showAMRRefined, indent) + "\n";
        str = str + boolToString("showExterior", showExterior, indent) + "\n";
        str = str + boolToString("showNotApplicable", showNotApplicable, indent) + "\n";
        return str;
    }


    // Attributes
    private boolean requestGhostZones;
    private boolean showDuplicated;
    private boolean showEnhancedConnectivity;
    private boolean showReducedConnectivity;
    private boolean showAMRRefined;
    private boolean showExterior;
    private boolean showNotApplicable;
}
