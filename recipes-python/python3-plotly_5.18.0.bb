SUMMARY = "An open-source, interactive data visualization library for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c7b311a6fbf8f1e2f22c16e2ad556f98"

PYPI_PACKAGE = "plotly"

inherit pypi setuptools3

SRC_URI[sha256sum] = "360a31e6fbb49d12b007036eb6929521343d6bee2236f8459915821baefa2cbb"

RDEPENDS:${PN} += " \
	${PYTHON_PN}-retrying \
	${PYTHON_PN}-six \
	"

FILES:${PN} += " \
    ${datadir}/* \
    ${prefix}/etc/jupyter/nbconfig/notebook.d/jupyterlab-plotly.json \
    "
