package pens.ce.model;

import com.google.gson.annotations.SerializedName;


public class FlowModel {
    @SerializedName("flowId")
    String flowId;
    @SerializedName("srcIp")
    String srcIp;
    @SerializedName("srcPort")
    int srcPort;
    @SerializedName("dstIp")
    String dstIp;
    @SerializedName("dstPort")
    int dstPort;
    @SerializedName("protocol")
    int protocol;
    @SerializedName("starttime")
    String startTime;
    @SerializedName("flowDuration")
    long flowDuration;
    @SerializedName("fwdPktCount")
    long fwdPktCount;
    @SerializedName("bwdPktCount")
    long bwdPktCount;
    @SerializedName("fwdPktStats")
    double fwdPktStats;
    @SerializedName("bwdPktStats")
    double bwdPktStats;
    @SerializedName("fwdPktMax")
    double fwdPktMax;
    @SerializedName("fwdPktMin")
    double fwdPktMin;
    @SerializedName("fwdPktMean")
    double fwdPktMean;
    @SerializedName("fwdPktStd")
    double fwdPktStd;
    @SerializedName("bwdPktMax")
    double bwdPktMax;
    @SerializedName("bwdPktMin")
    double bwdPktMin;
    @SerializedName("bwdPktMean")
    double bwdPktMean;
    @SerializedName("bwdPktStd")
    double bwdPktStd;
    @SerializedName("flowBytePs")
    double flowBytePs;
    @SerializedName("flowPktPs")
    double flowPktPs;
    @SerializedName("flowIATMean")
    double flowIATMean;
    @SerializedName("flowIATStd")
    double flowIATStd;
    @SerializedName("flowIATMax")
    double flowIATMax;
    @SerializedName("flowIATMin")
    double flowIATMin;
    @SerializedName("fwdIATSum")
    double fwdIATSum;
    @SerializedName("fwdIATMean")
    double fwdIATMean;
    @SerializedName("fwdIATStd")
    double fwdIATStd;
    @SerializedName("fwdIATMax")
    double fwdIATMax;
    @SerializedName("fwdIATMin")
    double fwdIATMin;
    @SerializedName("bwdIATSum")
    double bwdIATSum;
    @SerializedName("bwdIATMean")
    double bwdIATMean;
    @SerializedName("bwdIATStd")
    double bwdIATStd;
    @SerializedName("bwdIATMax")
    double bwdIATMax;
    @SerializedName("bwdIATMin")
    double bwdIATMin;
    @SerializedName("fwdPshCount")
    int fwdPshCount;
    @SerializedName("bwdPshCount")
    int bwdPshCount;
    @SerializedName("fwdUrgCount")
    int fwdUrgCount;
    @SerializedName("bwdUrgCount")
    int bwdUrgCount;
    @SerializedName("fwdHeaderLen")
    double fwdHeaderLen;
    @SerializedName("bwdHeaderLen")
    double bwdHeaderLen;
    @SerializedName("fwdPktPS")
    double fwdPktPS;
    @SerializedName("bwdPktPS")
    double bwdPktPS;
    @SerializedName("pktLenMin")
    double PktLenMin;
    @SerializedName("pktLenMax")
    double PktLenMax;
    @SerializedName("pktLenMean")
    double pktLenMean;
    @SerializedName("pktLenStd")
    double pktLenStd;
    @SerializedName("pktLenVar")
    double pktLenVar;
    @SerializedName("finFlagCnt")
    int finFlagCnt;
    @SerializedName("synFlagCnt")
    int synFlagCnt;
    @SerializedName("rstFlagCnt")
    int rstFlagCnt;
    @SerializedName("pshFlagCnt")
    int pshFlagCnt;
    @SerializedName("ackFlagCnt")
    int ackFlagCnt;
    @SerializedName("urgFlagCnt")
    int urgFlagCnt;
    @SerializedName("cwrFlagCnt")
    int cwrFlagCnt;
    @SerializedName("eceFlagCnt")
    int eceFlagCnt;
    @SerializedName("upDownRatio")
    double upDownRatio;
    @SerializedName("avgPktSize")
    double avgPktSize;
    @SerializedName("fwdAvgSegmentSize")
    double fwdAvgSegmentSize;
    @SerializedName("bwdAvgSegmentSize")
    double bwdAvgSegmentSize;
    @SerializedName("fwdAvgBytesPBulk")
    long fwdAvgBytesPBulk;
    @SerializedName("fwdAvgPktPBulk")
    long fwdAbgPktPBulk;
    @SerializedName("fwdAvgBulkRate")
    long fwdAvgBulkRate;
    @SerializedName("bwdAvgBytesPBulk")
    long bwdAvgBytesPBulk;
    @SerializedName("bwdAvgPktPBulk")
    long bwdAvgPktPBulk;
    @SerializedName("bwdAvgBulkRate")
    long bwdAvgBulkRate;
    @SerializedName("fwdSubFlowPkt")
    long fwdSubFlowPkt;
    @SerializedName("fwdSubFlowBytes")
    long fwdSubFlowBytes;
    @SerializedName("bwdSubFlowPkt")
    long bwdSubFlowPkt;
    @SerializedName("bwdSubFlowBytes")
    long bwdSubFlowBytes;
    @SerializedName("initWinBytesFwd")
    int initWinBytesFwd;
    @SerializedName("initWinBytesBwd")
    int initWinBytesBwd;
    @SerializedName("fwdActData")
    long fwdActData;
    @SerializedName("fwdSegSize")
    long fwdSegSize;
    @SerializedName("flowActiveMean")
    double flowActiveMean;
    @SerializedName("flowActiveStd")
    double flowActiveStd;
    @SerializedName("flowActiveMax")
    double flowActiveMax;
    @SerializedName("flowActiveMin")
    double flowActiveMin;
    @SerializedName("flowIdleMean")
    double flowIdleMean;
    @SerializedName("flowIdleStd")
    double flowIdleStd;
    @SerializedName("flowIdleMax")
    double flowIdleMax;
    @SerializedName("flowIdleMin")
    double flowIdleMin;
    @SerializedName("label")
    String label;

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public void setSrcPort(int srcPort) {
        this.srcPort = srcPort;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public void setDstPort(int dstPort) {
        this.dstPort = dstPort;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setFlowDuration(long flowDuration) {
        this.flowDuration = flowDuration;
    }

    public void setFwdPktCount(long fwdPktCount) {
        this.fwdPktCount = fwdPktCount;
    }

    public void setBwdPktCount(long bwdPktCount) {
        this.bwdPktCount = bwdPktCount;
    }

    public void setFwdPktStats(double fwdPktStats) {
        this.fwdPktStats = fwdPktStats;
    }

    public void setBwdPktStats(double bwdPktStats) {
        this.bwdPktStats = bwdPktStats;
    }

    public void setFwdPktMax(double fwdPktMax) {
        this.fwdPktMax = fwdPktMax;
    }

    public void setFwdPktMin(double fwdPktMin) {
        this.fwdPktMin = fwdPktMin;
    }

    public void setFwdPktMean(double fwdPktMean) {
        this.fwdPktMean = fwdPktMean;
    }

    public void setFwdPktStd(double fwdPktStd) {
        this.fwdPktStd = fwdPktStd;
    }

    public void setBwdPktMax(double bwdPktMax) {
        this.bwdPktMax = bwdPktMax;
    }

    public void setBwdPktMin(double bwdPktMin) {
        this.bwdPktMin = bwdPktMin;
    }

    public void setBwdPktMean(double bwdPktMean) {
        this.bwdPktMean = bwdPktMean;
    }

    public void setBwdPktStd(double bwdPktStd) {
        this.bwdPktStd = bwdPktStd;
    }

    public void setFlowBytePs(double flowBytePs) {
        this.flowBytePs = flowBytePs;
    }

    public void setFlowPktPs(double flowPktPs) {
        this.flowPktPs = flowPktPs;
    }

    public void setFlowIATMean(double flowIATMean) {
        this.flowIATMean = flowIATMean;
    }

    public void setFlowIATStd(double flowIATStd) {
        this.flowIATStd = flowIATStd;
    }

    public void setFlowIATMax(double flowIATMax) {
        this.flowIATMax = flowIATMax;
    }

    public void setFlowIATMin(double flowIATMin) {
        this.flowIATMin = flowIATMin;
    }

    public void setFwdIATSum(double fwdIATSum) {
        this.fwdIATSum = fwdIATSum;
    }

    public void setFwdIATMean(double fwdIATMean) {
        this.fwdIATMean = fwdIATMean;
    }

    public void setFwdIATStd(double fwdIATStd) {
        this.fwdIATStd = fwdIATStd;
    }

    public void setFwdIATMax(double fwdIATMax) {
        this.fwdIATMax = fwdIATMax;
    }

    public void setFwdIATMin(double fwdIATMin) {
        this.fwdIATMin = fwdIATMin;
    }

    public void setBwdIATSum(double bwdIATSum) {
        this.bwdIATSum = bwdIATSum;
    }

    public void setBwdIATMean(double bwdIATMean) {
        this.bwdIATMean = bwdIATMean;
    }

    public void setBwdIATStd(double bwdIATStd) {
        this.bwdIATStd = bwdIATStd;
    }

    public void setBwdIATMax(double bwdIATMax) {
        this.bwdIATMax = bwdIATMax;
    }

    public void setBwdIATMin(double bwdIATMin) {
        this.bwdIATMin = bwdIATMin;
    }

    public void setFwdPshCount(int fwdPshCount) {
        this.fwdPshCount = fwdPshCount;
    }

    public void setBwdPshCount(int bwdPshCount) {
        this.bwdPshCount = bwdPshCount;
    }

    public void setFwdUrgCount(int fwdUrgCount) {
        this.fwdUrgCount = fwdUrgCount;
    }

    public void setBwdUrgCount(int bwdUrgCount) {
        this.bwdUrgCount = bwdUrgCount;
    }

    public void setFwdHeaderLen(double fwdHeaderLen) {
        this.fwdHeaderLen = fwdHeaderLen;
    }

    public void setBwdHeaderLen(double bwdHeaderLen) {
        this.bwdHeaderLen = bwdHeaderLen;
    }

    public void setFwdPktPS(double fwdPktPS) {
        this.fwdPktPS = fwdPktPS;
    }

    public void setBwdPktPS(double bwdPktPS) {
        this.bwdPktPS = bwdPktPS;
    }

    public void setPktLenMin(double pktLenMin) {
        PktLenMin = pktLenMin;
    }

    public void setPktLenMax(double pktLenMax) {
        PktLenMax = pktLenMax;
    }

    public void setPktLenMean(double pktLenMean) {
        this.pktLenMean = pktLenMean;
    }

    public void setPktLenStd(double pktLenStd) {
        this.pktLenStd = pktLenStd;
    }

    public void setPktLenVar(double pktLenVar) {
        this.pktLenVar = pktLenVar;
    }

    public void setFinFlagCnt(int finFlagCnt) {
        this.finFlagCnt = finFlagCnt;
    }

    public void setSynFlagCnt(int synFlagCnt) {
        this.synFlagCnt = synFlagCnt;
    }

    public void setRstFlagCnt(int rstFlagCnt) {
        this.rstFlagCnt = rstFlagCnt;
    }

    public void setPshFlagCnt(int pshFlagCnt) {
        this.pshFlagCnt = pshFlagCnt;
    }

    public void setAckFlagCnt(int ackFlagCnt) {
        this.ackFlagCnt = ackFlagCnt;
    }

    public void setUrgFlagCnt(int urgFlagCnt) {
        this.urgFlagCnt = urgFlagCnt;
    }

    public void setCwrFlagCnt(int cwrFlagCnt) {
        this.cwrFlagCnt = cwrFlagCnt;
    }

    public void setEceFlagCnt(int eceFlagCnt) {
        this.eceFlagCnt = eceFlagCnt;
    }

    public void setUpDownRatio(double upDownRatio) {
        this.upDownRatio = upDownRatio;
    }

    public void setAvgPktSize(double avgPktSize) {
        this.avgPktSize = avgPktSize;
    }

    public void setFwdAvgSegmentSize(double fwdAvgSegmentSize) {
        this.fwdAvgSegmentSize = fwdAvgSegmentSize;
    }

    public void setBwdAvgSegmentSize(double bwdAvgSegmentSize) {
        this.bwdAvgSegmentSize = bwdAvgSegmentSize;
    }

    public void setFwdAvgBytesPBulk(long fwdAvgBytesPBulk) {
        this.fwdAvgBytesPBulk = fwdAvgBytesPBulk;
    }

    public void setFwdAbgPktPBulk(long fwdAbgPktPBulk) {
        this.fwdAbgPktPBulk = fwdAbgPktPBulk;
    }

    public void setFwdAvgBulkRate(long fwdAvgBulkRate) {
        this.fwdAvgBulkRate = fwdAvgBulkRate;
    }

    public void setBwdAvgBytesPBulk(long bwdAvgBytesPBulk) {
        this.bwdAvgBytesPBulk = bwdAvgBytesPBulk;
    }

    public void setBwdAvgPktPBulk(long bwdAvgPktPBulk) {
        this.bwdAvgPktPBulk = bwdAvgPktPBulk;
    }

    public void setBwdAvgBulkRate(long bwdAvgBulkRate) {
        this.bwdAvgBulkRate = bwdAvgBulkRate;
    }

    public void setFwdSubFlowPkt(long fwdSubFlowPkt) {
        this.fwdSubFlowPkt = fwdSubFlowPkt;
    }

    public void setFwdSubFlowBytes(long fwdSubFlowBytes) {
        this.fwdSubFlowBytes = fwdSubFlowBytes;
    }

    public void setBwdSubFlowPkt(long bwdSubFlowPkt) {
        this.bwdSubFlowPkt = bwdSubFlowPkt;
    }

    public void setBwdSubFlowBytes(long bwdSubFlowBytes) {
        this.bwdSubFlowBytes = bwdSubFlowBytes;
    }

    public void setInitWinBytesFwd(int initWinBytesFwd) {
        this.initWinBytesFwd = initWinBytesFwd;
    }

    public void setInitWinBytesBwd(int initWinBytesBwd) {
        this.initWinBytesBwd = initWinBytesBwd;
    }

    public void setFwdActData(long fwdActData) {
        this.fwdActData = fwdActData;
    }

    public void setFwdSegSize(long fwdSegSize) {
        this.fwdSegSize = fwdSegSize;
    }

    public void setFlowActiveMean(double flowActiveMean) {
        this.flowActiveMean = flowActiveMean;
    }

    public void setFlowActiveStd(double flowActiveStd) {
        this.flowActiveStd = flowActiveStd;
    }

    public void setFlowActiveMax(double flowActiveMax) {
        this.flowActiveMax = flowActiveMax;
    }

    public void setFlowActiveMin(double flowActiveMin) {
        this.flowActiveMin = flowActiveMin;
    }

    public void setFlowIdleMean(double flowIdleMean) {
        this.flowIdleMean = flowIdleMean;
    }

    public void setFlowIdleStd(double flowIdleStd) {
        this.flowIdleStd = flowIdleStd;
    }

    public void setFlowIdleMax(double flowIdleMax) {
        this.flowIdleMax = flowIdleMax;
    }

    public void setFlowIdleMin(double flowIdleMin) {
        this.flowIdleMin = flowIdleMin;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
