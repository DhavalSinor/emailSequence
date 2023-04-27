package com.sequence.api.base.dto;

import lombok.*;

/**
 * @author Nawaz
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {

    /**
     * The Name of the host.
     */
    private String hostName;

    /**
     * The User Agent.
     */
    private String userAgent;

    /**
     * The Proxy IP.
     */
    private String proxyIp;

    /**
     * The Proxy Server.
     */
    private String proxyServer;

    /**
     * The Proxy Origin.
     */
    private String proxyOrigin;

    /**
     * The Proxy Connection.
     */
    private String proxyConnection;

    /**
     * Headers Info.
     */
    private String headersInfo;

}
