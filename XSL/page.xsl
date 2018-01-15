<?xml version="1.0" encoding="ISO-8859-1"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html><body>
            <xsl:apply-templates/>
        </body></html>
    </xsl:template>

    <xsl:template match="/PAGE/HEADING">
        <h1 align="center"> <xsl:apply-templates/> </h1>
    </xsl:template>

    <xsl:template match="/PAGE/ARTICLE">
        <div style="float:left;width:70%;"><xsl:apply-templates/> </div>
    </xsl:template>

    <xsl:template match="/PAGE/ARTICLE/TITLE">
        <h3> <xsl:apply-templates/> </h3>
    </xsl:template>

    <xsl:template match="/PAGE/ARTICLE/DESCRIPTION">
        <p> <xsl:apply-templates/> </p>
    </xsl:template>

    <xsl:template match="/PAGE/ASIDE/TITLE">
        <div style="float:left;width:30%;"><h3> <xsl:apply-templates/> </h3></div>
    </xsl:template>

    <xsl:template match="ITEM">
        <p> <xsl:apply-templates/> </p>
    </xsl:template>

    <xsl:template match="/PAGE/FOOTER">
        <div style="clear:both;"></div>
        <h1 align="center"> <xsl:apply-templates/> </h1>
    </xsl:template>

</xsl:stylesheet>