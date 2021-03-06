package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LFTincanLrsAgentProfile in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsAgentProfile
 * @generated
 */
public class LFTincanLrsAgentProfileCacheModel implements CacheModel<LFTincanLrsAgentProfile>,
    Externalizable {
    public long id;
    public Integer documentId;
    public Integer agentId;
    public String profileId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", documentId=");
        sb.append(documentId);
        sb.append(", agentId=");
        sb.append(agentId);
        sb.append(", profileId=");
        sb.append(profileId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public LFTincanLrsAgentProfile toEntityModel() {
        LFTincanLrsAgentProfileImpl lfTincanLrsAgentProfileImpl = new LFTincanLrsAgentProfileImpl();

        lfTincanLrsAgentProfileImpl.setId(id);
        lfTincanLrsAgentProfileImpl.setDocumentId(documentId);
        lfTincanLrsAgentProfileImpl.setAgentId(agentId);

        if (profileId == null) {
            lfTincanLrsAgentProfileImpl.setProfileId(StringPool.BLANK);
        } else {
            lfTincanLrsAgentProfileImpl.setProfileId(profileId);
        }

        lfTincanLrsAgentProfileImpl.resetOriginalValues();

        return lfTincanLrsAgentProfileImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        documentId = objectInput.readInt();
        agentId = objectInput.readInt();
        profileId = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeInt(documentId);
        objectOutput.writeInt(agentId);

        if (profileId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(profileId);
        }
    }
}
